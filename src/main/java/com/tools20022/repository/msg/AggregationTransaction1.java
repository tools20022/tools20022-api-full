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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.BulkPayment;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DetailedAmount6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment transaction with an aggregated amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmFirstPaymentDateTime
 * AggregationTransaction1.mmFirstPaymentDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmLastPaymentDateTime
 * AggregationTransaction1.mmLastPaymentDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmNumberOfPayments
 * AggregationTransaction1.mmNumberOfPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmIndividualPayment
 * AggregationTransaction1.mmIndividualPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BulkPayment
 * BulkPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregationTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment transaction with an aggregated amount."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AggregationTransaction2
 * AggregationTransaction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregationTransaction1", propOrder = {"firstPaymentDateTime", "lastPaymentDateTime", "numberOfPayments", "individualPayment"})
public class AggregationTransaction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrstPmtDtTm")
	protected ISODateTime firstPaymentDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
	 * AggregationTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstPmtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstPaymentDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the first payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmFirstPaymentDateTime
	 * AggregationTransaction2.mmFirstPaymentDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregationTransaction1, Optional<ISODateTime>> mmFirstPaymentDateTime = new MMMessageAttribute<AggregationTransaction1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregationTransaction1.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDateTime";
			definition = "Date and time of the first payment.";
			nextVersions_lazy = () -> Arrays.asList(AggregationTransaction2.mmFirstPaymentDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(AggregationTransaction1 obj) {
			return obj.getFirstPaymentDateTime();
		}

		@Override
		public void setValue(AggregationTransaction1 obj, Optional<ISODateTime> value) {
			obj.setFirstPaymentDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "LastPmtDtTm")
	protected ISODateTime lastPaymentDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
	 * AggregationTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastPmtDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastPaymentDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the last payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmLastPaymentDateTime
	 * AggregationTransaction2.mmLastPaymentDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregationTransaction1, Optional<ISODateTime>> mmLastPaymentDateTime = new MMMessageAttribute<AggregationTransaction1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregationTransaction1.mmObject();
			isDerived = false;
			xmlTag = "LastPmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPaymentDateTime";
			definition = "Date and time of the last payment.";
			nextVersions_lazy = () -> Arrays.asList(AggregationTransaction2.mmLastPaymentDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(AggregationTransaction1 obj) {
			return obj.getLastPaymentDateTime();
		}

		@Override
		public void setValue(AggregationTransaction1 obj, Optional<ISODateTime> value) {
			obj.setLastPaymentDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "NbOfPmts")
	protected Number numberOfPayments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
	 * AggregationTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfPmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total number of payments that has been aggregated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmNumberOfPayments
	 * AggregationTransaction2.mmNumberOfPayments}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregationTransaction1, Optional<Number>> mmNumberOfPayments = new MMMessageAttribute<AggregationTransaction1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregationTransaction1.mmObject();
			isDerived = false;
			xmlTag = "NbOfPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfPayments";
			definition = "Total number of payments that has been aggregated.";
			nextVersions_lazy = () -> Arrays.asList(AggregationTransaction2.mmNumberOfPayments);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AggregationTransaction1 obj) {
			return obj.getNumberOfPayments();
		}

		@Override
		public void setValue(AggregationTransaction1 obj, Optional<Number> value) {
			obj.setNumberOfPayments(value.orElse(null));
		}
	};
	@XmlElement(name = "IndvPmt")
	protected List<DetailedAmount6> individualPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount6
	 * DetailedAmount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
	 * AggregationTransaction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual payment that has been aggregated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmIndividualPayment
	 * AggregationTransaction2.mmIndividualPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregationTransaction1, List<DetailedAmount6>> mmIndividualPayment = new MMMessageAssociationEnd<AggregationTransaction1, List<DetailedAmount6>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregationTransaction1.mmObject();
			isDerived = false;
			xmlTag = "IndvPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPayment";
			definition = "Individual payment that has been aggregated.";
			nextVersions_lazy = () -> Arrays.asList(AggregationTransaction2.mmIndividualPayment);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount6.mmObject();
		}

		@Override
		public List<DetailedAmount6> getValue(AggregationTransaction1 obj) {
			return obj.getIndividualPayment();
		}

		@Override
		public void setValue(AggregationTransaction1 obj, List<DetailedAmount6> value) {
			obj.setIndividualPayment(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregationTransaction1.mmFirstPaymentDateTime, com.tools20022.repository.msg.AggregationTransaction1.mmLastPaymentDateTime,
						com.tools20022.repository.msg.AggregationTransaction1.mmNumberOfPayments, com.tools20022.repository.msg.AggregationTransaction1.mmIndividualPayment);
				trace_lazy = () -> BulkPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregationTransaction1";
				definition = "Payment transaction with an aggregated amount.";
				nextVersions_lazy = () -> Arrays.asList(AggregationTransaction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getFirstPaymentDateTime() {
		return firstPaymentDateTime == null ? Optional.empty() : Optional.of(firstPaymentDateTime);
	}

	public AggregationTransaction1 setFirstPaymentDateTime(ISODateTime firstPaymentDateTime) {
		this.firstPaymentDateTime = firstPaymentDateTime;
		return this;
	}

	public Optional<ISODateTime> getLastPaymentDateTime() {
		return lastPaymentDateTime == null ? Optional.empty() : Optional.of(lastPaymentDateTime);
	}

	public AggregationTransaction1 setLastPaymentDateTime(ISODateTime lastPaymentDateTime) {
		this.lastPaymentDateTime = lastPaymentDateTime;
		return this;
	}

	public Optional<Number> getNumberOfPayments() {
		return numberOfPayments == null ? Optional.empty() : Optional.of(numberOfPayments);
	}

	public AggregationTransaction1 setNumberOfPayments(Number numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
		return this;
	}

	public List<DetailedAmount6> getIndividualPayment() {
		return individualPayment == null ? individualPayment = new ArrayList<>() : individualPayment;
	}

	public AggregationTransaction1 setIndividualPayment(List<DetailedAmount6> individualPayment) {
		this.individualPayment = Objects.requireNonNull(individualPayment);
		return this;
	}
}