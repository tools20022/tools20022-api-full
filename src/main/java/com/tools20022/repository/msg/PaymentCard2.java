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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.CardType1Code;
import com.tools20022.repository.datatype.ISOYearMonth;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.PaymentCard;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device, which typically contains a microprocessor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmType
 * PaymentCard2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmNumber
 * PaymentCard2.mmNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmHolderName
 * PaymentCard2.mmHolderName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmStartDate
 * PaymentCard2.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmExpiryDate
 * PaymentCard2.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmCardIssuerName
 * PaymentCard2.mmCardIssuerName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCard2#mmCardIssuerIdentification
 * PaymentCard2.mmCardIssuerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmSecurityCode
 * PaymentCard2.mmSecurityCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmSequenceNumber
 * PaymentCard2.mmSequenceNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentCard
 * PaymentCard}</li>
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
 * "PaymentCard2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18 PaymentCard18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25 PaymentCard25}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCard2", propOrder = {"type", "number", "holderName", "startDate", "expiryDate", "cardIssuerName", "cardIssuerIdentification", "securityCode", "sequenceNumber"})
public class PaymentCard2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected CardType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardType1Code
	 * CardType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmType
	 * PaymentCard.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of card, eg, credit card."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmType
	 * PaymentCard18.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmType
	 * PaymentCard25.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, CardType1Code> mmType = new MMMessageAttribute<PaymentCard2, CardType1Code>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of card, eg, credit card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmType, PaymentCard25.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardType1Code.mmObject();
		}

		@Override
		public CardType1Code getValue(PaymentCard2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PaymentCard2 obj, CardType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Nb", required = true)
	protected Max35Text number;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmNumber
	 * PaymentCard.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number embossed on a card that links the card to the account owner and account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmNumber
	 * PaymentCard18.mmNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmNumber
	 * PaymentCard25.mmNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Max35Text> mmNumber = new MMMessageAttribute<PaymentCard2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Number embossed on a card that links the card to the account owner and account servicer.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmNumber, PaymentCard25.mmNumber);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard2 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(PaymentCard2 obj, Max35Text value) {
			obj.setNumber(value);
		}
	};
	@XmlElement(name = "HldrNm", required = true)
	protected Max35Text holderName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HolderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party entitled by a card issuer to use a card."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmHolderName
	 * PaymentCard18.mmHolderName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmHolderName
	 * PaymentCard25.mmHolderName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Max35Text> mmHolderName = new MMMessageAttribute<PaymentCard2, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> CardholderRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "HldrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HolderName";
			definition = "Party entitled by a card issuer to use a card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmHolderName, PaymentCard25.mmHolderName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentCard2 obj) {
			return obj.getHolderName();
		}

		@Override
		public void setValue(PaymentCard2 obj, Max35Text value) {
			obj.setHolderName(value);
		}
	};
	@XmlElement(name = "StartDt")
	protected ISOYearMonth startDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmStartDate
	 * PaymentCard.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card is available for use."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmStartDate
	 * PaymentCard18.mmStartDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmStartDate
	 * PaymentCard25.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Optional<ISOYearMonth>> mmStartDate = new MMMessageAttribute<PaymentCard2, Optional<ISOYearMonth>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmStartDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Year and month the card is available for use.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmStartDate, PaymentCard25.mmStartDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public Optional<ISOYearMonth> getValue(PaymentCard2 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(PaymentCard2 obj, Optional<ISOYearMonth> value) {
			obj.setStartDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt", required = true)
	protected ISOYearMonth expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISOYearMonth ISOYearMonth}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmExpiryDate
	 * PaymentCard.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Year and month the card expires."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmExpiryDate
	 * PaymentCard18.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmExpiryDate
	 * PaymentCard25.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, ISOYearMonth> mmExpiryDate = new MMMessageAttribute<PaymentCard2, ISOYearMonth>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Year and month the card expires.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmExpiryDate, PaymentCard25.mmExpiryDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYearMonth.mmObject();
		}

		@Override
		public ISOYearMonth getValue(PaymentCard2 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(PaymentCard2 obj, ISOYearMonth value) {
			obj.setExpiryDate(value);
		}
	};
	@XmlElement(name = "CardIssrNm")
	protected Max35Text cardIssuerName;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardIssrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues a payment card, as expressed by a numeric identification of the card issuer according to ISO/IEC 7812-1."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmCardIssuerName
	 * PaymentCard18.mmCardIssuerName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmCardIssuerName
	 * PaymentCard25.mmCardIssuerName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Optional<Max35Text>> mmCardIssuerName = new MMMessageAttribute<PaymentCard2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "CardIssrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerName";
			definition = "Party that issues a payment card, as expressed by a numeric identification of the card issuer according to ISO/IEC 7812-1.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmCardIssuerName, PaymentCard25.mmCardIssuerName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard2 obj) {
			return obj.getCardIssuerName();
		}

		@Override
		public void setValue(PaymentCard2 obj, Optional<Max35Text> value) {
			obj.setCardIssuerName(value.orElse(null));
		}
	};
	@XmlElement(name = "CardIssrId")
	protected PartyIdentification2Choice cardIssuerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardIssrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that issues a payment card, as expressed by a numeric identification of the card issuer according to ISO/IEC 7812-1."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmCardIssuerIdentification
	 * PaymentCard18.mmCardIssuerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmCardIssuerIdentification
	 * PaymentCard25.mmCardIssuerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Optional<PartyIdentification2Choice>> mmCardIssuerIdentification = new MMMessageAttribute<PaymentCard2, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "CardIssrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerIdentification";
			definition = "Party that issues a payment card, as expressed by a numeric identification of the card issuer according to ISO/IEC 7812-1.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmCardIssuerIdentification, PaymentCard25.mmCardIssuerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(PaymentCard2 obj) {
			return obj.getCardIssuerIdentification();
		}

		@Override
		public void setValue(PaymentCard2 obj, Optional<PartyIdentification2Choice> value) {
			obj.setCardIssuerIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyCd")
	protected Max35Text securityCode;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSecurityCode
	 * PaymentCard.mmSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security code written on, or in, the card."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmSecurityCode
	 * PaymentCard18.mmSecurityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmSecurityCode
	 * PaymentCard25.mmSecurityCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Optional<Max35Text>> mmSecurityCode = new MMMessageAttribute<PaymentCard2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSecurityCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "SctyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityCode";
			definition = "Security code written on, or in, the card.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmSecurityCode, PaymentCard25.mmSecurityCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentCard2 obj) {
			return obj.getSecurityCode();
		}

		@Override
		public void setValue(PaymentCard2 obj, Optional<Max35Text> value) {
			obj.setSecurityCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max3Text sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmSequenceNumber
	 * PaymentCard.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCard2 PaymentCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number distinguishing two or more payment cards with the same account number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard18#mmSequenceNumber
	 * PaymentCard18.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentCard25#mmSequenceNumber
	 * PaymentCard25.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCard2, Optional<Max3Text>> mmSequenceNumber = new MMMessageAttribute<PaymentCard2, Optional<Max3Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentCard.mmSequenceNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCard2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Number distinguishing two or more payment cards with the same account number.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmSequenceNumber, PaymentCard25.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(PaymentCard2 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(PaymentCard2 obj, Optional<Max3Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.mmType, com.tools20022.repository.msg.PaymentCard2.mmNumber, com.tools20022.repository.msg.PaymentCard2.mmHolderName,
						com.tools20022.repository.msg.PaymentCard2.mmStartDate, com.tools20022.repository.msg.PaymentCard2.mmExpiryDate, com.tools20022.repository.msg.PaymentCard2.mmCardIssuerName,
						com.tools20022.repository.msg.PaymentCard2.mmCardIssuerIdentification, com.tools20022.repository.msg.PaymentCard2.mmSecurityCode, com.tools20022.repository.msg.PaymentCard2.mmSequenceNumber);
				trace_lazy = () -> PaymentCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCard2";
				definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCard18.mmObject(), PaymentCard25.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CardType1Code getType() {
		return type;
	}

	public PaymentCard2 setType(CardType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public PaymentCard2 setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public Max35Text getHolderName() {
		return holderName;
	}

	public PaymentCard2 setHolderName(Max35Text holderName) {
		this.holderName = Objects.requireNonNull(holderName);
		return this;
	}

	public Optional<ISOYearMonth> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public PaymentCard2 setStartDate(ISOYearMonth startDate) {
		this.startDate = startDate;
		return this;
	}

	public ISOYearMonth getExpiryDate() {
		return expiryDate;
	}

	public PaymentCard2 setExpiryDate(ISOYearMonth expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public Optional<Max35Text> getCardIssuerName() {
		return cardIssuerName == null ? Optional.empty() : Optional.of(cardIssuerName);
	}

	public PaymentCard2 setCardIssuerName(Max35Text cardIssuerName) {
		this.cardIssuerName = cardIssuerName;
		return this;
	}

	public Optional<PartyIdentification2Choice> getCardIssuerIdentification() {
		return cardIssuerIdentification == null ? Optional.empty() : Optional.of(cardIssuerIdentification);
	}

	public PaymentCard2 setCardIssuerIdentification(PartyIdentification2Choice cardIssuerIdentification) {
		this.cardIssuerIdentification = cardIssuerIdentification;
		return this;
	}

	public Optional<Max35Text> getSecurityCode() {
		return securityCode == null ? Optional.empty() : Optional.of(securityCode);
	}

	public PaymentCard2 setSecurityCode(Max35Text securityCode) {
		this.securityCode = securityCode;
		return this;
	}

	public Optional<Max3Text> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public PaymentCard2 setSequenceNumber(Max3Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}
}