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
 * This InterestPaymentRequest message is sent by either;<br>
 * - the collateral taker or its collateral manager to the collateral giver or
 * its collateral manager, or<br>
 * - the collateral giver or its collateral manager to the collateral taker or
 * its collateral manager<br>
 * It is used to request payment or advise the amount due for interest
 * calculated for a specified period. The interest is based on the amount of
 * collateral that has been held during the calculation period. It is possible
 * to send these messages on a bi-lateral basis for matching.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The InterestPaymentRequest message is used to advise the interest amount
 * calculated for a specific period or request payment for an interest amount
 * for a specific period.
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
 * xmlTag} = "IntrstPmtReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmTransactionIdentification
 * InterestPaymentRequestV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmObligation
 * InterestPaymentRequestV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmAgreement
 * InterestPaymentRequestV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmInterestDueToA
 * InterestPaymentRequestV03.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmInterestDueToB
 * InterestPaymentRequestV03.mmInterestDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmNetAmountDetails
 * InterestPaymentRequestV03.mmNetAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV03#mmSupplementaryData
 * InterestPaymentRequestV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.013.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestPaymentRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis InterestPaymentRequest message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nIt is used to request payment or advise the amount due for interest calculated for a specified period. The interest is based on the amount of collateral that has been held during the calculation period. It is possible to send these messages on a bi-lateral basis for matching.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentRequest message is used to advise the interest amount calculated for a specific period or request payment for an interest amount for a specific period."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04
 * InterestPaymentRequestV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InterestPaymentRequestV03", propOrder = {"transactionIdentification", "obligation", "agreement", "interestDueToA", "interestDueToB", "netAmountDetails", "supplementaryData"})
public class InterestPaymentRequestV03 {

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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmTransactionIdentification
	 * InterestPaymentRequestV04.mmTransactionIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getTransactionIdentification", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmObligation
	 * InterestPaymentRequestV04.mmObligation}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getObligation", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmAgreement
	 * InterestPaymentRequestV04.mmAgreement}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestAmount1 interestDueToA;
	/**
	 * Provides details on the interest amount due to party A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToA
	 * InterestPaymentRequestV04.mmInterestDueToA}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmInterestDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getInterestDueToA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestAmount1 interestDueToB;
	/**
	 * Provides details on the interest amount due to party B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToB
	 * InterestPaymentRequestV04.mmInterestDueToB}</li>
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
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmInterestDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestAmount1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getInterestDueToB", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InterestResult1 netAmountDetails;
	/**
	 * Provides the net interest amount due to A or due to B in case of
	 * collateral held and posted during a period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InterestResult1
	 * InterestResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the net interest amount due to A or due to B in case of collateral held and posted during a period."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmNetAmountDetails
	 * InterestPaymentRequestV04.mmNetAmountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetAmountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetAmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountDetails";
			definition = "Provides the net interest amount due to A or due to B in case of collateral held and posted during a period.";
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmNetAmountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestResult1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getNetAmountDetails", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmSupplementaryData
	 * InterestPaymentRequestV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InterestPaymentRequestV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestPaymentRequestV03";
				definition = "Scope\r\nThis InterestPaymentRequest message is sent by either;\r\n- the collateral taker or its collateral manager to the collateral giver or its collateral manager, or\r\n- the collateral giver or its collateral manager to the collateral taker or its collateral manager\r\nIt is used to request payment or advise the amount due for interest calculated for a specified period. The interest is based on the amount of collateral that has been held during the calculation period. It is possible to send these messages on a bi-lateral basis for matching.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe InterestPaymentRequest message is used to advise the interest amount calculated for a specific period or request payment for an interest amount for a specific period.";
				nextVersions_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "IntrstPmtReq";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmTransactionIdentification, com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmObligation,
						com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmAgreement, com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmInterestDueToA,
						com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmInterestDueToB, com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmNetAmountDetails,
						com.tools20022.repository.area.colr.InterestPaymentRequestV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "013";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InterestPaymentRequestV03.class;
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

	@XmlElement(name = "Agrmt", required = true)
	public Agreement2 getAgreement() {
		return agreement;
	}

	public void setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
	}

	@XmlElement(name = "IntrstDueToA")
	public InterestAmount1 getInterestDueToA() {
		return interestDueToA;
	}

	public void setInterestDueToA(InterestAmount1 interestDueToA) {
		this.interestDueToA = interestDueToA;
	}

	@XmlElement(name = "IntrstDueToB")
	public InterestAmount1 getInterestDueToB() {
		return interestDueToB;
	}

	public void setInterestDueToB(InterestAmount1 interestDueToB) {
		this.interestDueToB = interestDueToB;
	}

	@XmlElement(name = "NetAmtDtls")
	public InterestResult1 getNetAmountDetails() {
		return netAmountDetails;
	}

	public void setNetAmountDetails(InterestResult1 netAmountDetails) {
		this.netAmountDetails = netAmountDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:colr.013.03.03")
	static public class Document {
		@XmlElement(name = "IntrstPmtReq", required = true)
		public InterestPaymentRequestV03 messageBody;
	}
}