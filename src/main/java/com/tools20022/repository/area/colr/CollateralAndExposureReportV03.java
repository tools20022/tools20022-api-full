/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import com.tools20022.repository.msgset.CollateralManagementMaintenance20162017;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CollateralAndExposureReport message is sent:<br>
 * - either by the collateral giver, or its collateral manager, to the
 * collateral taker, or its collateral manager, or<br>
 * - or by the collateral taker, or its collateral manager to the collateral
 * giver, or its collateral manager<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CollateralAndExposureReport is used to provide the details of the
 * valuation of the collateral, that is, the valuation of securities collateral,
 * cash collateral or other type of collateral, posted at a specific calculation
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOLatestversion
 * CollateralManagementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementMaintenance20162017
 * CollateralManagementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollAndXpsrRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmReportParameters
 * CollateralAndExposureReportV03.mmReportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmPagination
 * CollateralAndExposureReportV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmObligation
 * CollateralAndExposureReportV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmAgreement
 * CollateralAndExposureReportV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmCollateralReport
 * CollateralAndExposureReportV03.mmCollateralReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV03#mmSupplementaryData
 * CollateralAndExposureReportV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.016.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAndExposureReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CollateralAndExposureReport message is sent:\r\n- either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or\r\n- or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralAndExposureReport is used to provide the details of the valuation of the collateral, that is, the valuation of securities collateral, cash collateral or other type of collateral, posted at a specific calculation date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02
 * CollateralAndExposureReportV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralAndExposureReportV03", propOrder = {"reportParameters", "pagination", "obligation", "agreement", "collateralReport", "supplementaryData"})
public class CollateralAndExposureReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected ReportParameters5 reportParameters;
	/**
	 * Provides information about the report such as the report identification,
	 * the report date and time or the report frequency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters5
	 * ReportParameters5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the report such as the report identification, the report date and time or the report frequency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmReportParameters
	 * CollateralAndExposureReportV02.mmReportParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides information about the report such as the report identification, the report date and time or the report frequency.";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmReportParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getReportParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Pagination pagination;
	/**
	 * Specifies the page number and an indicator of whether it is the only or
	 * last page, or if there are additional pages. <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the page number and an indicator of whether it is the only or last page, or if there are additional pages. \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmPagination
	 * CollateralAndExposureReportV02.mmPagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Specifies the page number and an indicator of whether it is the only or last page, or if there are additional pages. \r\n";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Obligation4 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation4
	 * Obligation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmObligation
	 * CollateralAndExposureReportV02.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmObligation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Agreement4 agreement;
	/**
	 * Agreement details for the over the counter market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement4
	 * Agreement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmAgreement
	 * CollateralAndExposureReportV02.mmAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Collateral13> collateralReport;
	/**
	 * Provides details on the collateral report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Collateral13
	 * Collateral13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the collateral report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmCollateralReport
	 * CollateralAndExposureReportV02.mmCollateralReport}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCollateralReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "CollRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralReport";
			definition = "Provides details on the collateral report.";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmCollateralReport;
			minOccurs = 1;
			complexType_lazy = () -> Collateral13.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getCollateralReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralAndExposureReportV02#mmSupplementaryData
	 * CollateralAndExposureReportV02.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			previousVersion_lazy = () -> CollateralAndExposureReportV02.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralAndExposureReportV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAndExposureReportV03";
				definition = "Scope\r\nThe CollateralAndExposureReport message is sent:\r\n- either by the collateral giver, or its collateral manager, to the collateral taker, or its collateral manager, or\r\n- or by the collateral taker, or its collateral manager to the collateral giver, or its collateral manager\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralAndExposureReport is used to provide the details of the valuation of the collateral, that is, the valuation of securities collateral, cash collateral or other type of collateral, posted at a specific calculation date.";
				previousVersion_lazy = () -> CollateralAndExposureReportV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject(), CollateralManagementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CollAndXpsrRpt";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmReportParameters, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmPagination,
						com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmObligation, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmAgreement,
						com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmCollateralReport, com.tools20022.repository.area.colr.CollateralAndExposureReportV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "016";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralAndExposureReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptParams", required = true)
	public ReportParameters5 getReportParameters() {
		return reportParameters;
	}

	public void setReportParameters(ReportParameters5 reportParameters) {
		this.reportParameters = reportParameters;
	}

	@XmlElement(name = "Pgntn")
	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	@XmlElement(name = "Oblgtn", required = true)
	public Obligation4 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation4 obligation) {
		this.obligation = obligation;
	}

	@XmlElement(name = "Agrmt")
	public Agreement4 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement4 agreement) {
		this.agreement = agreement;
	}

	@XmlElement(name = "CollRpt", required = true)
	public List<Collateral13> getCollateralReport() {
		return collateralReport;
	}

	public void setCollateralReport(List<Collateral13> collateralReport) {
		this.collateralReport = collateralReport;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.016.03.03")
	static public class Document {
		@XmlElement(name = "CollAndXpsrRpt", required = true)
		public CollateralAndExposureReportV03 messageBody;
	}
}