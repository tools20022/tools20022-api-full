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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.FinalStatus1Code;
import com.tools20022.repository.codeset.PendingStatus4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a list of pending statuses or final statuses.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmPending
 * PaymentStatusCode6Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmFinal
 * PaymentStatusCode6Choice.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmRTGS
 * PaymentStatusCode6Choice.mmRTGS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmSettlement
 * PaymentStatusCode6Choice.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice#mmProprietary
 * PaymentStatusCode6Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "PaymentStatusCode6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a list of pending statuses or final statuses."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice
 * PaymentStatusCode5Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusCode6Choice", propOrder = {"pending", "final_", "rTGS", "settlement", "proprietary"})
public class PaymentStatusCode6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pdg", required = true)
	protected PendingStatus4Code pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
	 * PaymentStatusCode6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the pending status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmPending
	 * PaymentStatusCode5Choice.mmPending}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusCode6Choice, PendingStatus4Code> mmPending = new MMMessageAttribute<PaymentStatusCode6Choice, PendingStatus4Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCode6Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Qualifies further the pending status.";
			previousVersion_lazy = () -> PaymentStatusCode5Choice.mmPending;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PendingStatus4Code.mmObject();
		}

		@Override
		public PendingStatus4Code getValue(PaymentStatusCode6Choice obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(PaymentStatusCode6Choice obj, PendingStatus4Code value) {
			obj.setPending(value);
		}
	};
	@XmlElement(name = "Fnl", required = true)
	protected FinalStatus1Code final_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinalStatus1Code
	 * FinalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
	 * PaymentStatusCode6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the final status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmFinal
	 * PaymentStatusCode5Choice.mmFinal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusCode6Choice, FinalStatus1Code> mmFinal = new MMMessageAttribute<PaymentStatusCode6Choice, FinalStatus1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCode6Choice.mmObject();
			isDerived = false;
			xmlTag = "Fnl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Qualifies further the final status.";
			previousVersion_lazy = () -> PaymentStatusCode5Choice.mmFinal;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinalStatus1Code.mmObject();
		}

		@Override
		public FinalStatus1Code getValue(PaymentStatusCode6Choice obj) {
			return obj.getFinal();
		}

		@Override
		public void setValue(PaymentStatusCode6Choice obj, FinalStatus1Code value) {
			obj.setFinal(value);
		}
	};
	@XmlElement(name = "RTGS", required = true)
	protected Max4AlphaNumericText rTGS;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmRTGS
	 * CashSettlement.mmRTGS}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
	 * PaymentStatusCode6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the RTGS status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmRTGS
	 * PaymentStatusCode5Choice.mmRTGS}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusCode6Choice, Max4AlphaNumericText> mmRTGS = new MMMessageAttribute<PaymentStatusCode6Choice, Max4AlphaNumericText>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmRTGS;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCode6Choice.mmObject();
			isDerived = false;
			xmlTag = "RTGS";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGS";
			definition = "Qualifies further the RTGS status.";
			previousVersion_lazy = () -> PaymentStatusCode5Choice.mmRTGS;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(PaymentStatusCode6Choice obj) {
			return obj.getRTGS();
		}

		@Override
		public void setValue(PaymentStatusCode6Choice obj, Max4AlphaNumericText value) {
			obj.setRTGS(value);
		}
	};
	@XmlElement(name = "Sttlm", required = true)
	protected Max4AlphaNumericText settlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
	 * PaymentStatusCode6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the settlement status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmSettlement
	 * PaymentStatusCode5Choice.mmSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusCode6Choice, Max4AlphaNumericText> mmSettlement = new MMMessageAttribute<PaymentStatusCode6Choice, Max4AlphaNumericText>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCode6Choice.mmObject();
			isDerived = false;
			xmlTag = "Sttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			definition = "Qualifies further the settlement status.";
			previousVersion_lazy = () -> PaymentStatusCode5Choice.mmSettlement;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(PaymentStatusCode6Choice obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(PaymentStatusCode6Choice obj, Max4AlphaNumericText value) {
			obj.setSettlement(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected Max35Text proprietary;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmInstructionStatus
	 * PaymentStatus.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode6Choice
	 * PaymentStatusCode6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies further the proprietary status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode5Choice#mmProprietary
	 * PaymentStatusCode5Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentStatusCode6Choice, Max35Text> mmProprietary = new MMMessageAttribute<PaymentStatusCode6Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmInstructionStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentStatusCode6Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Qualifies further the proprietary status.";
			previousVersion_lazy = () -> PaymentStatusCode5Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentStatusCode6Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PaymentStatusCode6Choice obj, Max35Text value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentStatusCode6Choice.mmPending, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmFinal,
						com.tools20022.repository.choice.PaymentStatusCode6Choice.mmRTGS, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmSettlement, com.tools20022.repository.choice.PaymentStatusCode6Choice.mmProprietary);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusCode6Choice";
				definition = "Choice between a list of pending statuses or final statuses.";
				previousVersion_lazy = () -> PaymentStatusCode5Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PendingStatus4Code getPending() {
		return pending;
	}

	public PaymentStatusCode6Choice setPending(PendingStatus4Code pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}

	public FinalStatus1Code getFinal() {
		return final_;
	}

	public PaymentStatusCode6Choice setFinal(FinalStatus1Code final_) {
		this.final_ = Objects.requireNonNull(final_);
		return this;
	}

	public Max4AlphaNumericText getRTGS() {
		return rTGS;
	}

	public PaymentStatusCode6Choice setRTGS(Max4AlphaNumericText rTGS) {
		this.rTGS = Objects.requireNonNull(rTGS);
		return this;
	}

	public Max4AlphaNumericText getSettlement() {
		return settlement;
	}

	public PaymentStatusCode6Choice setSettlement(Max4AlphaNumericText settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public PaymentStatusCode6Choice setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}