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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.CollateralCancellationStatus1;
import com.tools20022.repository.msg.Obligation4;
import com.tools20022.repository.msg.Reference16;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CollateralManagementISOLatestversion;
import com.tools20022.repository.msgset.CollateralManagementMaintenance20162017;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CollateralManagementCancellationStatus message is sent by:<br>
 * - the collateral taker or its collateral manager to the collateral giver or
 * its collateral manager, or<br>
 * - the collateral giver or its collateral manager to the collateral taker or
 * its collateral manager.<br>
 * This message is used to provide the status of accepted or rejected for the
 * CollateralManagementCancellationRequest message previously received.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The CollateralManagementCancellationStatus message can be sent to provide a
 * status for a previously received CollateralManagementCancellationRequest
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmTransactionIdentification
 * CollateralManagementCancellationStatusV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmReference
 * CollateralManagementCancellationStatusV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmObligation
 * CollateralManagementCancellationStatusV04.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmCancellationStatus
 * CollateralManagementCancellationStatusV04.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmSupplementaryData
 * CollateralManagementCancellationStatusV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollMgmtCxlSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementLatestVersion
 * CollateralManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.006.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralManagementCancellationStatusV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CollateralManagementCancellationStatus message is sent by:\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager.\r\nThis message is used to provide the status of accepted or rejected for the CollateralManagementCancellationRequest message previously received.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralManagementCancellationStatus message can be sent to provide a status for a previously received CollateralManagementCancellationRequest message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03
 * CollateralManagementCancellationStatusV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralManagementCancellationStatusV04", propOrder = {"transactionIdentification", "reference", "obligation", "cancellationStatus", "supplementaryData"})
public class CollateralManagementCancellationStatusV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmTransactionIdentification
	 * CollateralManagementCancellationStatusV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationStatusV04.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Ref", required = true)
	protected Reference16 reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Reference16
	 * Reference16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides reference to the previous received message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmReference
	 * CollateralManagementCancellationStatusV03.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Provides reference to the previous received message.";
			previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Reference16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationStatusV04.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation4 obligation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmObligation
	 * CollateralManagementCancellationStatusV03.mmObligation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmObligation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationStatusV04.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlSts", required = true)
	protected CollateralCancellationStatus1 cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1
	 * CollateralCancellationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides status details of the collateral cancellation message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmCancellationStatus
	 * CollateralManagementCancellationStatusV03.mmCancellationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Provides status details of the collateral cancellation message.";
			previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmCancellationStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CollateralCancellationStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationStatusV04.class.getMethod("getCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmSupplementaryData
	 * CollateralManagementCancellationStatusV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralManagementCancellationStatusV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralManagementCancellationStatusV04";
				definition = "Scope\r\nThe CollateralManagementCancellationStatus message is sent by:\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager.\r\nThis message is used to provide the status of accepted or rejected for the CollateralManagementCancellationRequest message previously received.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe CollateralManagementCancellationStatus message can be sent to provide a status for a previously received CollateralManagementCancellationRequest message.";
				previousVersion_lazy = () -> CollateralManagementCancellationStatusV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CollateralManagementISOLatestversion.mmObject(), CollateralManagementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CollMgmtCxlSts";
				businessArea_lazy = () -> CollateralManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.mmTransactionIdentification,
						com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.mmReference, com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.mmObligation,
						com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.mmCancellationStatus, com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "006";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralManagementCancellationStatusV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public CollateralManagementCancellationStatusV04 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Reference16 getReference() {
		return reference;
	}

	public CollateralManagementCancellationStatusV04 setReference(Reference16 reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Obligation4 getObligation() {
		return obligation;
	}

	public CollateralManagementCancellationStatusV04 setObligation(Obligation4 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public CollateralCancellationStatus1 getCancellationStatus() {
		return cancellationStatus;
	}

	public CollateralManagementCancellationStatusV04 setCancellationStatus(CollateralCancellationStatus1 cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CollateralManagementCancellationStatusV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.006.001.04")
	static public class Document {
		@XmlElement(name = "CollMgmtCxlSts", required = true)
		public CollateralManagementCancellationStatusV04 messageBody;
	}
}