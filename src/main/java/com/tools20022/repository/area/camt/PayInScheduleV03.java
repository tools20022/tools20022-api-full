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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The PayInSchedule message is sent by a central settlement system to the
 * participant to provide notification of a series of timed payments scheduled
 * for each currency at the time and date of the schedule generation. The
 * central settlement system may send information about how the timed payments
 * have been calculated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPartyIdentification
 * PayInScheduleV03.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmReportData
 * PayInScheduleV03.mmReportData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInScheduleLongBalance
 * PayInScheduleV03.mmPayInScheduleLongBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInScheduleItem
 * PayInScheduleV03.mmPayInScheduleItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmPayInFactors
 * PayInScheduleV03.mmPayInFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInScheduleV03#mmSupplementaryData
 * PayInScheduleV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PayInSchdl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.062.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayInScheduleV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PayInScheduleV03", propOrder = {"partyIdentification", "reportData", "payInScheduleLongBalance", "payInScheduleItem", "payInFactors", "supplementaryData"})
public class PayInScheduleV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyId", required = true)
	protected PartyIdentification73Choice partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which the pay-in schedule is generated."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPartyIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Party for which the pay-in schedule is generated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPartyIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptData", required = true)
	protected ReportData4 reportData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportData4
	 * ReportData4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information applicable to the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportData = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportData";
			definition = "General information applicable to the report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportData4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getReportData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PayInSchdlLngBal")
	protected List<BalanceStatus2> payInScheduleLongBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BalanceStatus2
	 * BalanceStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInSchdlLngBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInScheduleLongBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Projected net position for all currencies, projected long for the value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInScheduleLongBalance = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInSchdlLngBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInScheduleLongBalance";
			definition = "Projected net position for all currencies, projected long for the value date.";
			minOccurs = 0;
			complexType_lazy = () -> BalanceStatus2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInScheduleLongBalance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PayInSchdlItm")
	protected List<PayInScheduleItems1> payInScheduleItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PayInScheduleItems1
	 * PayInScheduleItems1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInSchdlItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInScheduleItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency and total amount to be paid in by the corresponding deadline."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInScheduleItem = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInSchdlItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInScheduleItem";
			definition = "Currency and total amount to be paid in by the corresponding deadline.";
			minOccurs = 0;
			complexType_lazy = () -> PayInScheduleItems1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInScheduleItem", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PayInFctrs")
	protected PayInFactors1 payInFactors;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PayInFactors1
	 * PayInFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInFctrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factors used in the calculation of the pay-in schedule."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPayInFactors = new MMMessageBuildingBlock() {
		{
			xmlTag = "PayInFctrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInFactors";
			definition = "Factors used in the calculation of the pay-in schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PayInFactors1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getPayInFactors", new Class[]{});
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PayInScheduleV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PayInScheduleV03";
				definition = "The PayInSchedule message is sent by a central settlement system to the participant to provide notification of a series of timed payments scheduled for each currency at the time and date of the schedule generation. The central settlement system may send information about how the timed payments have been calculated.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "PayInSchdl";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.PayInScheduleV03.mmPartyIdentification, com.tools20022.repository.area.camt.PayInScheduleV03.mmReportData,
						com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInScheduleLongBalance, com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInScheduleItem,
						com.tools20022.repository.area.camt.PayInScheduleV03.mmPayInFactors, com.tools20022.repository.area.camt.PayInScheduleV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "062";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PayInScheduleV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification73Choice getPartyIdentification() {
		return partyIdentification;
	}

	public PayInScheduleV03 setPartyIdentification(PartyIdentification73Choice partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}

	public ReportData4 getReportData() {
		return reportData;
	}

	public PayInScheduleV03 setReportData(ReportData4 reportData) {
		this.reportData = Objects.requireNonNull(reportData);
		return this;
	}

	public List<BalanceStatus2> getPayInScheduleLongBalance() {
		return payInScheduleLongBalance == null ? payInScheduleLongBalance = new ArrayList<>() : payInScheduleLongBalance;
	}

	public PayInScheduleV03 setPayInScheduleLongBalance(List<BalanceStatus2> payInScheduleLongBalance) {
		this.payInScheduleLongBalance = Objects.requireNonNull(payInScheduleLongBalance);
		return this;
	}

	public List<PayInScheduleItems1> getPayInScheduleItem() {
		return payInScheduleItem == null ? payInScheduleItem = new ArrayList<>() : payInScheduleItem;
	}

	public PayInScheduleV03 setPayInScheduleItem(List<PayInScheduleItems1> payInScheduleItem) {
		this.payInScheduleItem = Objects.requireNonNull(payInScheduleItem);
		return this;
	}

	public Optional<PayInFactors1> getPayInFactors() {
		return payInFactors == null ? Optional.empty() : Optional.of(payInFactors);
	}

	public PayInScheduleV03 setPayInFactors(PayInFactors1 payInFactors) {
		this.payInFactors = payInFactors;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PayInScheduleV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.062.001.03")
	static public class Document {
		@XmlElement(name = "PayInSchdl", required = true)
		public PayInScheduleV03 messageBody;
	}
}