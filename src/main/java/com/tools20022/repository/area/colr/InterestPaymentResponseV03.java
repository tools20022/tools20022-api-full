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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This InterestPaymentResponse message is sent by either;<br>
 * - the collateral taker or its collateral manager to the collateral giver or
 * its collateral manager, or<br>
 * - the collateral giver or its collateral manager to the collateral taker or
 * its collateral manager<br>
 * This is a response to the InterestPaymentRequest message and the amount of
 * interest requested or advised can be accepted or rejected.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The InterestPaymentResponse message is sent in response to the
 * InterestPaymentRequest in order to accept or reject the amount of interest
 * requested or advised. A rejection reason and information can be provide if
 * the InterestPaymentRequest is being rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmTransactionIdentification
 * InterestPaymentResponseV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmObligation
 * InterestPaymentResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmAgreement
 * InterestPaymentResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestDueToA
 * InterestPaymentResponseV03.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestDueToB
 * InterestPaymentResponseV03.mmInterestDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmInterestResponse
 * InterestPaymentResponseV03.mmInterestResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV03#mmSupplementaryData
 * InterestPaymentResponseV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
 * CollateralManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "IntrstPmtRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.014.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestPaymentResponseV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis InterestPaymentResponse message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nThis is a response to the InterestPaymentRequest message and the amount of interest requested or advised can be accepted or rejected.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentResponse message is sent in response to the InterestPaymentRequest in order to accept or reject the amount of interest requested or advised. A rejection reason and information can be provide if the InterestPaymentRequest is being rejected."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04
 * InterestPaymentResponseV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestPaymentResponseV03", propOrder = {"transactionIdentification", "obligation", "agreement", "interestDueToA", "interestDueToB", "interestResponse", "supplementaryData"})
public class InterestPaymentResponseV03 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmTransactionIdentification
	 * InterestPaymentResponseV04.mmTransactionIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation3 obligation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmObligation
	 * InterestPaymentResponseV04.mmObligation}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Agrmt", required = true)
	protected Agreement2 agreement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmAgreement
	 * InterestPaymentResponseV04.mmAgreement}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IntrstDueToA")
	protected InterestAmount2 interestDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the interest amount due to party A."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestDueToA
	 * InterestPaymentResponseV04.mmInterestDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInterestDueToA = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrstDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueToA";
			definition = "Provides details on the interest amount due to party A.";
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmInterestDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getInterestDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IntrstDueToB")
	protected InterestAmount2 interestDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount2
	 * InterestAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the interest amount due to party B."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestDueToB
	 * InterestPaymentResponseV04.mmInterestDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInterestDueToB = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrstDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueToB";
			definition = "Provides details on the interest amount due to party B.";
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmInterestDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getInterestDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IntrstRspn", required = true)
	protected InterestResponse1 interestResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InterestResponse1
	 * InterestResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the response to the interest payment request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmInterestResponse
	 * InterestPaymentResponseV04.mmInterestResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInterestResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "IntrstRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestResponse";
			definition = "Provides details on the response to the interest payment request.";
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmInterestResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InterestResponse1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getInterestResponse", new Class[]{});
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentResponseV04#mmSupplementaryData
	 * InterestPaymentResponseV04.mmSupplementaryData}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentResponseV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestPaymentResponseV03";
				definition = "Scope\r\nThis InterestPaymentResponse message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nThis is a response to the InterestPaymentRequest message and the amount of interest requested or advised can be accepted or rejected.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentResponse message is sent in response to the InterestPaymentRequest in order to accept or reject the amount of interest requested or advised. A rejection reason and information can be provide if the InterestPaymentRequest is being rejected.";
				nextVersions_lazy = () -> Arrays.asList(InterestPaymentResponseV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "IntrstPmtRspn";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmTransactionIdentification, com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmObligation,
						com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmAgreement, com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmInterestDueToA,
						com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmInterestDueToB, com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmInterestResponse,
						com.tools20022.repository.area.colr.InterestPaymentResponseV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "014";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestPaymentResponseV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public InterestPaymentResponseV03 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation3 getObligation() {
		return obligation;
	}

	public InterestPaymentResponseV03 setObligation(Obligation3 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Agreement2 getAgreement() {
		return agreement;
	}

	public InterestPaymentResponseV03 setAgreement(Agreement2 agreement) {
		this.agreement = Objects.requireNonNull(agreement);
		return this;
	}

	public Optional<InterestAmount2> getInterestDueToA() {
		return interestDueToA == null ? Optional.empty() : Optional.of(interestDueToA);
	}

	public InterestPaymentResponseV03 setInterestDueToA(InterestAmount2 interestDueToA) {
		this.interestDueToA = interestDueToA;
		return this;
	}

	public Optional<InterestAmount2> getInterestDueToB() {
		return interestDueToB == null ? Optional.empty() : Optional.of(interestDueToB);
	}

	public InterestPaymentResponseV03 setInterestDueToB(InterestAmount2 interestDueToB) {
		this.interestDueToB = interestDueToB;
		return this;
	}

	public InterestResponse1 getInterestResponse() {
		return interestResponse;
	}

	public InterestPaymentResponseV03 setInterestResponse(InterestResponse1 interestResponse) {
		this.interestResponse = Objects.requireNonNull(interestResponse);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public InterestPaymentResponseV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.014.001.03")
	static public class Document {
		@XmlElement(name = "IntrstPmtRspn", required = true)
		public InterestPaymentResponseV03 messageBody;
	}
}