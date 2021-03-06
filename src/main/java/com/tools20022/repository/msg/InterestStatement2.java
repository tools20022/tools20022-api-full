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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails;
import com.tools20022.repository.msg.InterestCalculation2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the interest statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestPeriod
 * InterestStatement2.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToA
 * InterestStatement2.mmTotalInterestAmountDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmTotalInterestAmountDueToB
 * InterestStatement2.mmTotalInterestAmountDueToB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement2#mmValueDate
 * InterestStatement2.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestPaymentRequestIdentification
 * InterestStatement2.mmInterestPaymentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestStatement2#mmInterestCalculationDetails
 * InterestStatement2.mmInterestCalculationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestStatement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the interest statement."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement3
 * InterestStatement3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestStatement2", propOrder = {"interestPeriod", "totalInterestAmountDueToA", "totalInterestAmountDueToB", "valueDate", "interestPaymentRequestIdentification", "interestCalculationDetails"})
public class InterestStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntrstPrd", required = true)
	protected DatePeriodDetails interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the period during which the interest rate has been applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestPeriod
	 * InterestStatement3.mmInterestPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestStatement2, DatePeriodDetails> mmInterestPeriod = new MMMessageAttribute<InterestStatement2, DatePeriodDetails>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Provides the period during which the interest rate has been applied.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmInterestPeriod);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public DatePeriodDetails getValue(InterestStatement2 obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(InterestStatement2 obj, DatePeriodDetails value) {
			obj.setInterestPeriod(value);
		}
	};
	@XmlElement(name = "TtlIntrstAmtDueToA")
	protected ActiveCurrencyAndAmount totalInterestAmountDueToA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrstAmtDueToA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterestAmountDueToA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the total amount of interest that is due to partyA."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToA
	 * InterestStatement3.mmTotalInterestAmountDueToA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestStatement2, Optional<ActiveCurrencyAndAmount>> mmTotalInterestAmountDueToA = new MMMessageAttribute<InterestStatement2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrstAmtDueToA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterestAmountDueToA";
			definition = "Provides the total amount of interest that is due to partyA.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmTotalInterestAmountDueToA);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(InterestStatement2 obj) {
			return obj.getTotalInterestAmountDueToA();
		}

		@Override
		public void setValue(InterestStatement2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalInterestAmountDueToA(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlIntrstAmtDueToB")
	protected ActiveCurrencyAndAmount totalInterestAmountDueToB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAmount
	 * Interest.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrstAmtDueToB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterestAmountDueToB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the total amount of interest that is due to partyB."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmTotalInterestAmountDueToB
	 * InterestStatement3.mmTotalInterestAmountDueToB}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestStatement2, Optional<ActiveCurrencyAndAmount>> mmTotalInterestAmountDueToB = new MMMessageAttribute<InterestStatement2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlIntrstAmtDueToB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterestAmountDueToB";
			definition = "Provides the total amount of interest that is due to partyB.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmTotalInterestAmountDueToB);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(InterestStatement2 obj) {
			return obj.getTotalInterestAmountDueToB();
		}

		@Override
		public void setValue(InterestStatement2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalInterestAmountDueToB(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt", required = true)
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
	 * Interest.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the value date of the interest statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmValueDate
	 * InterestStatement3.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestStatement2, ISODate> mmValueDate = new MMMessageAttribute<InterestStatement2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Interest.mmPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Indicates the value date of the interest statement.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmValueDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(InterestStatement2 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(InterestStatement2 obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	@XmlElement(name = "IntrstPmtReqId")
	protected Max35Text interestPaymentRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the reference to the interest payment request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestPaymentRequestIdentification
	 * InterestStatement3.mmInterestPaymentRequestIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestStatement2, Optional<Max35Text>> mmInterestPaymentRequestIdentification = new MMMessageAttribute<InterestStatement2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Provides the reference to the interest payment request.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmInterestPaymentRequestIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InterestStatement2 obj) {
			return obj.getInterestPaymentRequestIdentification();
		}

		@Override
		public void setValue(InterestStatement2 obj, Optional<Max35Text> value) {
			obj.setInterestPaymentRequestIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstClctnDtls")
	protected List<InterestCalculation2> interestCalculationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InterestCalculation2
	 * InterestCalculation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestStatement2
	 * InterestStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstClctnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the interest calculation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement3#mmInterestCalculation
	 * InterestStatement3.mmInterestCalculation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestStatement2, List<InterestCalculation2>> mmInterestCalculationDetails = new MMMessageAssociationEnd<InterestStatement2, List<InterestCalculation2>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestStatement2.mmObject();
			isDerived = false;
			xmlTag = "IntrstClctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestCalculationDetails";
			definition = "Provides the details of the interest calculation.";
			nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmInterestCalculation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestCalculation2.mmObject();
		}

		@Override
		public List<InterestCalculation2> getValue(InterestStatement2 obj) {
			return obj.getInterestCalculationDetails();
		}

		@Override
		public void setValue(InterestStatement2 obj, List<InterestCalculation2> value) {
			obj.setInterestCalculationDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InterestStatement2.mmInterestPeriod, com.tools20022.repository.msg.InterestStatement2.mmTotalInterestAmountDueToA,
						com.tools20022.repository.msg.InterestStatement2.mmTotalInterestAmountDueToB, com.tools20022.repository.msg.InterestStatement2.mmValueDate,
						com.tools20022.repository.msg.InterestStatement2.mmInterestPaymentRequestIdentification, com.tools20022.repository.msg.InterestStatement2.mmInterestCalculationDetails);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InterestStatement2";
				definition = "Provides details on the interest statement.";
				nextVersions_lazy = () -> Arrays.asList(InterestStatement3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DatePeriodDetails getInterestPeriod() {
		return interestPeriod;
	}

	public InterestStatement2 setInterestPeriod(DatePeriodDetails interestPeriod) {
		this.interestPeriod = Objects.requireNonNull(interestPeriod);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalInterestAmountDueToA() {
		return totalInterestAmountDueToA == null ? Optional.empty() : Optional.of(totalInterestAmountDueToA);
	}

	public InterestStatement2 setTotalInterestAmountDueToA(ActiveCurrencyAndAmount totalInterestAmountDueToA) {
		this.totalInterestAmountDueToA = totalInterestAmountDueToA;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalInterestAmountDueToB() {
		return totalInterestAmountDueToB == null ? Optional.empty() : Optional.of(totalInterestAmountDueToB);
	}

	public InterestStatement2 setTotalInterestAmountDueToB(ActiveCurrencyAndAmount totalInterestAmountDueToB) {
		this.totalInterestAmountDueToB = totalInterestAmountDueToB;
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public InterestStatement2 setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public Optional<Max35Text> getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification == null ? Optional.empty() : Optional.of(interestPaymentRequestIdentification);
	}

	public InterestStatement2 setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = interestPaymentRequestIdentification;
		return this;
	}

	public List<InterestCalculation2> getInterestCalculationDetails() {
		return interestCalculationDetails == null ? interestCalculationDetails = new ArrayList<>() : interestCalculationDetails;
	}

	public InterestStatement2 setInterestCalculationDetails(List<InterestCalculation2> interestCalculationDetails) {
		this.interestCalculationDetails = Objects.requireNonNull(interestCalculationDetails);
		return this;
	}
}