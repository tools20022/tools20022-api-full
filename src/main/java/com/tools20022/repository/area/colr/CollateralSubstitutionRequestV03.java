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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CollateralManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This CollateralSubstitutionRequest message is sent by either the collateral
 * giver or its collateral manager to the collateral taker or its collateral
 * manager. It is used to request a substitution of collateral by specifying the
 * collateral to be returned and proposing the new type(s) of collateral to be
 * delivered. Note: There are cases where the collateral taker can initiate the
 * CollateralSubstitutionRequest message, for example in case of breach in the
 * concentration limit.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CollateralSubstitutionRequest message can be sent by either the
 * collateral giver or collateral taker in order to substitute collateral that
 * is already held by the other party.
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
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
 * CollateralManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollSbstitnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmTransactionIdentification
 * CollateralSubstitutionRequestV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmObligation
 * CollateralSubstitutionRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmAgreement
 * CollateralSubstitutionRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmCollateralSubstitutionReturn
 * CollateralSubstitutionRequestV03.mmCollateralSubstitutionReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmCollateralSubstitutionDeliver
 * CollateralSubstitutionRequestV03.mmCollateralSubstitutionDeliver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03#mmSupplementaryData
 * CollateralSubstitutionRequestV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.010.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis CollateralSubstitutionRequest message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to request a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered. Note: There are cases where the collateral taker can initiate the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralSubstitutionRequest message can be sent by either the collateral giver or collateral taker in order to substitute collateral that is already held by the other party."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04
 * CollateralSubstitutionRequestV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralSubstitutionRequestV03", propOrder = {"transactionIdentification", "obligation", "agreement", "collateralSubstitutionReturn", "collateralSubstitutionDeliver", "supplementaryData"})
public class CollateralSubstitutionRequestV03 {

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
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmTransactionIdentification
	 * CollateralSubstitutionRequestV04.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Obligation3 obligation;
	/**
	 * Provides information like the identification of the party or parties
	 * associated with the collateral agreement, the exposure type and the
	 * valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation3
	 * Obligation3}</li>
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
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmObligation
	 * CollateralSubstitutionRequestV04.mmObligation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Agreement2 agreement;
	/**
	 * Agreement details for the over the counter market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
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
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmAgreement
	 * CollateralSubstitutionRequestV04.mmAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralSubstitution2 collateralSubstitutionReturn;
	/**
	 * Provides details about the collateral that will be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2
	 * CollateralSubstitution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnRtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral that will be returned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmCollateralSubstitutionReturn
	 * CollateralSubstitutionRequestV04.mmCollateralSubstitutionReturn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCollateralSubstitutionReturn = new MMMessageBuildingBlock() {
		{
			xmlTag = "CollSbstitnRtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionReturn";
			definition = "Provides details about the collateral that will be returned.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmCollateralSubstitutionReturn);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CollateralSubstitution2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getCollateralSubstitutionReturn", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralSubstitution3 collateralSubstitutionDeliver;
	/**
	 * Provides details about the collateral that will be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3
	 * CollateralSubstitution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnDlvr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionDeliver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral that will be delivered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmCollateralSubstitutionDeliver
	 * CollateralSubstitutionRequestV04.mmCollateralSubstitutionDeliver}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCollateralSubstitutionDeliver = new MMMessageBuildingBlock() {
		{
			xmlTag = "CollSbstitnDlvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionDeliver";
			definition = "Provides details about the collateral that will be delivered.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmCollateralSubstitutionDeliver);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CollateralSubstitution3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getCollateralSubstitutionDeliver", new Class[]{});
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmSupplementaryData
	 * CollateralSubstitutionRequestV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralSubstitutionRequestV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionRequestV03";
				definition = "Scope\r\nThis CollateralSubstitutionRequest message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to request a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered. Note: There are cases where the collateral taker can initiate the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralSubstitutionRequest message can be sent by either the collateral giver or collateral taker in order to substitute collateral that is already held by the other party.";
				nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CollSbstitnReq";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmTransactionIdentification,
						com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmObligation, com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmAgreement,
						com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmCollateralSubstitutionReturn, com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmCollateralSubstitutionDeliver,
						com.tools20022.repository.area.colr.CollateralSubstitutionRequestV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "010";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralSubstitutionRequestV03.class;
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
	public Obligation3 getObligation() {
		return obligation;
	}

	public void setObligation(Obligation3 obligation) {
		this.obligation = obligation;
	}

	@XmlElement(name = "Agrmt")
	public Agreement2 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
	}

	@XmlElement(name = "CollSbstitnRtr", required = true)
	public CollateralSubstitution2 getCollateralSubstitutionReturn() {
		return collateralSubstitutionReturn;
	}

	public void setCollateralSubstitutionReturn(CollateralSubstitution2 collateralSubstitutionReturn) {
		this.collateralSubstitutionReturn = collateralSubstitutionReturn;
	}

	@XmlElement(name = "CollSbstitnDlvr")
	public CollateralSubstitution3 getCollateralSubstitutionDeliver() {
		return collateralSubstitutionDeliver;
	}

	public void setCollateralSubstitutionDeliver(CollateralSubstitution3 collateralSubstitutionDeliver) {
		this.collateralSubstitutionDeliver = collateralSubstitutionDeliver;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.010.03.03")
	static public class Document {
		@XmlElement(name = "CollSbstitnReq", required = true)
		public CollateralSubstitutionRequestV03 messageBody;
	}
}