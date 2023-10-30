import React from "react";
import { Spin, Icon } from "antd";
// import { Spin, Icon } from "@ant-design/icons";
export default function LoadingIndicator(props) {
  const antIcon = (
    <Icon type="loading-3-quarters" style={{ fontSize: 30 }} spin />
  );
  return (
    <Spin
      indicator={antIcon}
      style={{ display: "block", textAlign: "center", marginTop: 30 }}
    />
  );
}
