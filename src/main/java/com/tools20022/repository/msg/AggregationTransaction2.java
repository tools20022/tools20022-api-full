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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmFirstPaymentDateTime
 * AggregationTransaction2.mmFirstPaymentDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmLastPaymentDateTime
 * AggregationTransaction2.mmLastPaymentDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmNumberOfPayments
 * AggregationTransaction2.mmNumberOfPayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2#mmIndividualPayment
 * AggregationTransaction2.mmIndividualPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BulkPayment
 * BulkPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregationTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment transaction with an aggregated amount."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1
 * AggregationTransaction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AggregationTransaction2", propOrder = {"firstPaymentDateTime", "lastPaymentDateTime", "numberOfPayments", "individualPayment"})
public class AggregationTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime firstPaymentDateTime;
	/**
	 * Date and time of the first payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmFirstPaymentDateTime
	 * AggregationTransaction1.mmFirstPaymentDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstPaymentDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> AggregationTransaction2.mmObject();
			isDerived = false;
			xmlTag = "FrstPmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstPaymentDateTime";
			definition = "Date and time of the first payment.";
			previousVersion_lazy = () -> AggregationTransaction1.mmFirstPaymentDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime lastPaymentDateTime;
	/**
	 * Date and time of the last payment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmLastPaymentDateTime
	 * AggregationTransaction1.mmLastPaymentDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLastPaymentDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> AggregationTransaction2.mmObject();
			isDerived = false;
			xmlTag = "LastPmtDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastPaymentDateTime";
			definition = "Date and time of the last payment.";
			previousVersion_lazy = () -> AggregationTransaction1.mmLastPaymentDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Number numberOfPayments;
	/**
	 * Total number of payments that has been aggregated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmNumberOfPayments
	 * AggregationTransaction1.mmNumberOfPayments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfPayments = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AggregationTransaction2.mmObject();
			isDerived = false;
			xmlTag = "NbOfPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfPayments";
			definition = "Total number of payments that has been aggregated.";
			previousVersion_lazy = () -> AggregationTransaction1.mmNumberOfPayments;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount14> individualPayment;
	/**
	 * Individual payment that has been aggregated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount14
	 * DetailedAmount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction2
	 * AggregationTransaction2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AggregationTransaction1#mmIndividualPayment
	 * AggregationTransaction1.mmIndividualPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualPayment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AggregationTransaction2.mmObject();
			isDerived = false;
			xmlTag = "IndvPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPayment";
			definition = "Individual payment that has been aggregated.";
			previousVersion_lazy = () -> AggregationTransaction1.mmIndividualPayment;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AggregationTransaction2.mmFirstPaymentDateTime, AggregationTransaction2.mmLastPaymentDateTime, AggregationTransaction2.mmNumberOfPayments,
						AggregationTransaction2.mmIndividualPayment);
				trace_lazy = () -> BulkPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregationTransaction2";
				definition = "Payment transaction with an aggregated amount.";
				previousVersion_lazy = () -> AggregationTransaction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FrstPmtDtTm")
	public ISODateTime getFirstPaymentDateTime() {
		return firstPaymentDateTime;
	}

	public void setFirstPaymentDateTime(ISODateTime firstPaymentDateTime) {
		this.firstPaymentDateTime = firstPaymentDateTime;
	}

	@XmlElement(name = "LastPmtDtTm")
	public ISODateTime getLastPaymentDateTime() {
		return lastPaymentDateTime;
	}

	public void setLastPaymentDateTime(ISODateTime lastPaymentDateTime) {
		this.lastPaymentDateTime = lastPaymentDateTime;
	}

	@XmlElement(name = "NbOfPmts")
	public Number getNumberOfPayments() {
		return numberOfPayments;
	}

	public void setNumberOfPayments(Number numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}

	@XmlElement(name = "IndvPmt")
	public List<DetailedAmount14> getIndividualPayment() {
		return individualPayment;
	}

	public void setIndividualPayment(List<com.tools20022.repository.msg.DetailedAmount14> individualPayment) {
		this.individualPayment = individualPayment;
	}
}