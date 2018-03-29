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
import com.tools20022.repository.codeset.PaymentInstrument1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the format under which the payment that generated the entry was
 * transmitted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#mmFINMessageType
 * PaymentOrigin1Choice.mmFINMessageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#mmXMLMessageName
 * PaymentOrigin1Choice.mmXMLMessageName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#mmProprietary
 * PaymentOrigin1Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice#mmInstrument
 * PaymentOrigin1Choice.mmInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentOrigin1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the format under which the payment that generated the entry was transmitted."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentOrigin1Choice", propOrder = {"fINMessageType", "xMLMessageName", "proprietary", "instrument"})
public class PaymentOrigin1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FINMT", required = true)
	protected Max3NumericText fINMessageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FINMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FINMessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the payment was included in a SWIFT FIN format message eg, MT 103."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentOrigin1Choice, Max3NumericText> mmFINMessageType = new MMMessageAttribute<PaymentOrigin1Choice, Max3NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentOrigin1Choice.mmObject();
			isDerived = false;
			xmlTag = "FINMT";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FINMessageType";
			definition = "Specifies that the payment was included in a SWIFT FIN format message eg, MT 103.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}

		@Override
		public Max3NumericText getValue(PaymentOrigin1Choice obj) {
			return obj.getFINMessageType();
		}

		@Override
		public void setValue(PaymentOrigin1Choice obj, Max3NumericText value) {
			obj.setFINMessageType(value);
		}
	};
	@XmlElement(name = "XMLMsgNm", required = true)
	protected Max35Text xMLMessageName;
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
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XMLMsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "XMLMessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the payment was included in a SWIFT XML message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentOrigin1Choice, Max35Text> mmXMLMessageName = new MMMessageAttribute<PaymentOrigin1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentOrigin1Choice.mmObject();
			isDerived = false;
			xmlTag = "XMLMsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "XMLMessageName";
			definition = "Specifies that the payment was included in a SWIFT XML message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentOrigin1Choice obj) {
			return obj.getXMLMessageName();
		}

		@Override
		public void setValue(PaymentOrigin1Choice obj, Max35Text value) {
			obj.setXMLMessageName(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
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
	 * definition} =
	 * "Specifies that the payment was included in a proprietary format message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentOrigin1Choice, Max35Text> mmProprietary = new MMMessageAttribute<PaymentOrigin1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentOrigin1Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies that the payment was included in a proprietary format message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentOrigin1Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PaymentOrigin1Choice obj, Max35Text value) {
			obj.setProprietary(value);
		}
	};
	@XmlElement(name = "Instrm", required = true)
	protected PaymentInstrument1Code instrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstrument1Code
	 * PaymentInstrument1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
	 * Payment.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of payment when not included in a SWIFT or proprietary format."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentOrigin1Choice, PaymentInstrument1Code> mmInstrument = new MMMessageAttribute<PaymentOrigin1Choice, PaymentInstrument1Code>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentInstrument;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentOrigin1Choice.mmObject();
			isDerived = false;
			xmlTag = "Instrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instrument";
			definition = "Specifies the type of payment when not included in a SWIFT or proprietary format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentInstrument1Code.mmObject();
		}

		@Override
		public PaymentInstrument1Code getValue(PaymentOrigin1Choice obj) {
			return obj.getInstrument();
		}

		@Override
		public void setValue(PaymentOrigin1Choice obj, PaymentInstrument1Code value) {
			obj.setInstrument(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentOrigin1Choice.mmFINMessageType, com.tools20022.repository.choice.PaymentOrigin1Choice.mmXMLMessageName,
						com.tools20022.repository.choice.PaymentOrigin1Choice.mmProprietary, com.tools20022.repository.choice.PaymentOrigin1Choice.mmInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentOrigin1Choice";
				definition = "Specifies the format under which the payment that generated the entry was transmitted.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max3NumericText getFINMessageType() {
		return fINMessageType;
	}

	public PaymentOrigin1Choice setFINMessageType(Max3NumericText fINMessageType) {
		this.fINMessageType = Objects.requireNonNull(fINMessageType);
		return this;
	}

	public Max35Text getXMLMessageName() {
		return xMLMessageName;
	}

	public PaymentOrigin1Choice setXMLMessageName(Max35Text xMLMessageName) {
		this.xMLMessageName = Objects.requireNonNull(xMLMessageName);
		return this;
	}

	public Max35Text getProprietary() {
		return proprietary;
	}

	public PaymentOrigin1Choice setProprietary(Max35Text proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}

	public PaymentInstrument1Code getInstrument() {
		return instrument;
	}

	public PaymentOrigin1Choice setInstrument(PaymentInstrument1Code instrument) {
		this.instrument = Objects.requireNonNull(instrument);
		return this;
	}
}