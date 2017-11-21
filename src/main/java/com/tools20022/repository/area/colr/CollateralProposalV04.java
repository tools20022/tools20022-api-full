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
import com.tools20022.repository.area.CollateralManagementPreviousVersion;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Agreement4;
import com.tools20022.repository.msg.Obligation4;
import com.tools20022.repository.msg.Proposal4;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CollateralProposal message is sent by the collateral giver or its
 * collateral manager to the collateral taker or its collateral manager, to
 * propose the collateral to be delivered. This message is sent once the Margin
 * Call is agreed or partially agreed and can be used for new collateral at the
 * initiation of an exposure or for additional collateral for variation of an
 * existing exposure. This message is used for both initial collateral proposal
 * and subsequent counter proposals.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * This message is sent once the Margin Call is agreed or partially agreed and
 * can be used for new collateral at the initiation of an exposure or for
 * additional collateral for variation of an existing exposure. The collateral
 * proposal can include securities, cash and other types of collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOLatestversion
 * CollateralManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollPrpsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmTransactionIdentification
 * CollateralProposalV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmObligation
 * CollateralProposalV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmAgreement
 * CollateralProposalV04.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmTypeAndDetails
 * CollateralProposalV04.mmTypeAndDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmSupplementaryData
 * CollateralProposalV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.007.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CollateralProposal message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager, to propose the collateral to be delivered. This message is sent once the Margin Call is agreed or partially agreed and can be used for new collateral at the initiation of an exposure or for additional collateral for variation of an existing exposure. This message is used for both initial collateral proposal and subsequent counter proposals.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThis message is sent once the Margin Call is agreed or partially agreed and can be used for new collateral at the initiation of an exposure or for additional collateral for variation of an existing exposure. The collateral proposal can include securities, cash and other types of collateral."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.colr.CollateralProposalV05
 * CollateralProposalV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03
 * CollateralProposalV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralProposalV04", propOrder = {"transactionIdentification", "obligation", "agreement", "typeAndDetails", "supplementaryData"})
public class CollateralProposalV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as know by the instructing
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmTransactionIdentification
	 * CollateralProposalV05.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmTransactionIdentification
	 * CollateralProposalV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmTransactionIdentification);
			previousVersion_lazy = () -> CollateralProposalV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposalV04.class.getMethod("getTransactionIdentification", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmObligation
	 * CollateralProposalV05.mmObligation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmObligation
	 * CollateralProposalV03.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmObligation);
			previousVersion_lazy = () -> CollateralProposalV03.mmObligation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposalV04.class.getMethod("getObligation", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmAgreement
	 * CollateralProposalV05.mmAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmAgreement
	 * CollateralProposalV03.mmAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmAgreement);
			previousVersion_lazy = () -> CollateralProposalV03.mmAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposalV04.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Proposal4 typeAndDetails;
	/**
	 * Indicates whether this is an initial or counter proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Proposal4
	 * Proposal4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpAndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAndDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether this is an initial or counter proposal."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmTypeAndDetails
	 * CollateralProposalV05.mmTypeAndDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmTypeAndDetails
	 * CollateralProposalV03.mmTypeAndDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTypeAndDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TpAndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAndDetails";
			definition = "Indicates whether this is an initial or counter proposal.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmTypeAndDetails);
			previousVersion_lazy = () -> CollateralProposalV03.mmTypeAndDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Proposal4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposalV04.class.getMethod("getTypeAndDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV05#mmSupplementaryData
	 * CollateralProposalV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV03#mmSupplementaryData
	 * CollateralProposalV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmSupplementaryData);
			previousVersion_lazy = () -> CollateralProposalV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposalV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalV04";
				definition = "Scope\r\nThe CollateralProposal message is sent by the collateral giver or its collateral manager to the collateral taker or its collateral manager, to propose the collateral to be delivered. This message is sent once the Margin Call is agreed or partially agreed and can be used for new collateral at the initiation of an exposure or for additional collateral for variation of an existing exposure. This message is used for both initial collateral proposal and subsequent counter proposals.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThis message is sent once the Margin Call is agreed or partially agreed and can be used for new collateral at the initiation of an exposure or for additional collateral for variation of an existing exposure. The collateral proposal can include securities, cash and other types of collateral.";
				nextVersions_lazy = () -> Arrays.asList(CollateralProposalV05.mmObject());
				previousVersion_lazy = () -> CollateralProposalV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CollPrpsl";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralProposalV04.mmTransactionIdentification, com.tools20022.repository.area.colr.CollateralProposalV04.mmObligation,
						com.tools20022.repository.area.colr.CollateralProposalV04.mmAgreement, com.tools20022.repository.area.colr.CollateralProposalV04.mmTypeAndDetails,
						com.tools20022.repository.area.colr.CollateralProposalV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "007";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralProposalV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
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

	@XmlElement(name = "TpAndDtls", required = true)
	public Proposal4 getTypeAndDetails() {
		return typeAndDetails;
	}

	public void setTypeAndDetails(Proposal4 typeAndDetails) {
		this.typeAndDetails = typeAndDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.007.04.04")
	static public class Document {
		@XmlElement(name = "CollPrpsl", required = true)
		public CollateralProposalV04 messageBody;
	}
}