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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifier of an account, as assigned by the account servicer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmCard
 * AccountIdentification39Choice.mmCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmMSISDN
 * AccountIdentification39Choice.mmMSISDN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmEMail
 * AccountIdentification39Choice.mmEMail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmIBAN
 * AccountIdentification39Choice.mmIBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmBBAN
 * AccountIdentification39Choice.mmBBAN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmUPIC
 * AccountIdentification39Choice.mmUPIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmDomestic
 * AccountIdentification39Choice.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice#mmOther
 * AccountIdentification39Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountIdentification
 * AccountIdentification}</li>
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
 * "AccountIdentification39Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifier of an account, as assigned by the account servicer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice
 * AccountIdentification30Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountIdentification39Choice", propOrder = {"card", "mSISDN", "eMail", "iBAN", "bBAN", "uPIC", "domestic", "other"})
public class AccountIdentification39Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Card", required = true)
	protected Min8Max28NumericText card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min8Max28NumericText
	 * Min8Max28NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PAN of the card identifying the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmCard
	 * AccountIdentification30Choice.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, Min8Max28NumericText> mmCard = new MMMessageAttribute<AccountIdentification39Choice, Min8Max28NumericText>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "PAN of the card identifying the account.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmCard;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Min8Max28NumericText.mmObject();
		}

		@Override
		public Min8Max28NumericText getValue(AccountIdentification39Choice obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, Min8Max28NumericText value) {
			obj.setCard(value);
		}
	};
	@XmlElement(name = "MSISDN", required = true)
	protected Max16Text mSISDN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MSISDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MSISDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mobile Subscriber Integrated Service Digital Network (i.e. mobile phone number of the SIM card)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmMSISDN
	 * AccountIdentification30Choice.mmMSISDN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, Max16Text> mmMSISDN = new MMMessageAttribute<AccountIdentification39Choice, Max16Text>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "MSISDN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MSISDN";
			definition = "Mobile Subscriber Integrated Service Digital Network (i.e. mobile phone number of the SIM card).";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmMSISDN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(AccountIdentification39Choice obj) {
			return obj.getMSISDN();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, Max16Text value) {
			obj.setMSISDN(value);
		}
	};
	@XmlElement(name = "EMail", required = true)
	protected Max256Text eMail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "E-mail identifying the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmEMail
	 * AccountIdentification30Choice.mmEMail}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, Max256Text> mmEMail = new MMMessageAttribute<AccountIdentification39Choice, Max256Text>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "EMail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMail";
			definition = "E-mail identifying the account.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmEMail;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(AccountIdentification39Choice obj) {
			return obj.getEMail();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, Max256Text value) {
			obj.setEMail(value);
		}
	};
	@XmlElement(name = "IBAN", required = true)
	protected IBANIdentifier iBAN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.IBANIdentifier
	 * IBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmIBAN
	 * AccountIdentification.mmIBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmIBAN
	 * AccountIdentification30Choice.mmIBAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, IBANIdentifier> mmIBAN = new MMMessageAttribute<AccountIdentification39Choice, IBANIdentifier>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmIBAN;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "IBAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBAN";
			definition = "International Bank Account Number (IBAN) - identifier used internationally by financial institutions to uniquely identify the account of a customer. Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmIBAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> IBANIdentifier.mmObject();
		}

		@Override
		public IBANIdentifier getValue(AccountIdentification39Choice obj) {
			return obj.getIBAN();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, IBANIdentifier value) {
			obj.setIBAN(value);
		}
	};
	@XmlElement(name = "BBAN", required = true)
	protected BBANIdentifier bBAN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BBANIdentifier
	 * BBANIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmBBAN
	 * AccountIdentification.mmBBAN}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BBAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, that is, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmBBAN
	 * AccountIdentification30Choice.mmBBAN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, BBANIdentifier> mmBBAN = new MMMessageAttribute<AccountIdentification39Choice, BBANIdentifier>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmBBAN;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "BBAN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BBAN";
			definition = "Basic Bank Account Number (BBAN) - identifier used nationally by financial institutions, that is, in individual countries, generally as part of a National Account Numbering Scheme(s), to uniquely identify the account of a customer.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmBBAN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BBANIdentifier.mmObject();
		}

		@Override
		public BBANIdentifier getValue(AccountIdentification39Choice obj) {
			return obj.getBBAN();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, BBANIdentifier value) {
			obj.setBBAN(value);
		}
	};
	@XmlElement(name = "UPIC", required = true)
	protected UPICIdentifier uPIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.UPICIdentifier
	 * UPICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmUPIC
	 * AccountIdentification.mmUPIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UPIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmUPIC
	 * AccountIdentification30Choice.mmUPIC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, UPICIdentifier> mmUPIC = new MMMessageAttribute<AccountIdentification39Choice, UPICIdentifier>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmUPIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "UPIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UPIC";
			definition = "Universal Payment Identification Code (UPIC) - identifier used by the New York Clearing House to mask confidential data, such as bank accounts and bank routing numbers. UPIC numbers remain with business customers, regardless of banking relationship changes.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmUPIC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UPICIdentifier.mmObject();
		}

		@Override
		public UPICIdentifier getValue(AccountIdentification39Choice obj) {
			return obj.getUPIC();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, UPICIdentifier value) {
			obj.setUPIC(value);
		}
	};
	@XmlElement(name = "Dmst", required = true)
	protected Max35Text domestic;
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
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification
	 * AccountIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dmst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmDomestic
	 * AccountIdentification30Choice.mmDomestic}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, Max35Text> mmDomestic = new MMMessageAttribute<AccountIdentification39Choice, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> AccountIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "Dmst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Account number used by financial institutions in individual countries to identify an account of a customer, but not necessarily the bank and branch of the financial institution in which the account is held.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmDomestic;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountIdentification39Choice obj) {
			return obj.getDomestic();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, Max35Text value) {
			obj.setDomestic(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected Max35Text other;
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
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification39Choice
	 * AccountIdentification39Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other identifier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification30Choice#mmOther
	 * AccountIdentification30Choice.mmOther}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountIdentification39Choice, Max35Text> mmOther = new MMMessageAttribute<AccountIdentification39Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountIdentification39Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other identifier.";
			previousVersion_lazy = () -> AccountIdentification30Choice.mmOther;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountIdentification39Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(AccountIdentification39Choice obj, Max35Text value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountIdentification39Choice.mmCard, com.tools20022.repository.choice.AccountIdentification39Choice.mmMSISDN,
						com.tools20022.repository.choice.AccountIdentification39Choice.mmEMail, com.tools20022.repository.choice.AccountIdentification39Choice.mmIBAN, com.tools20022.repository.choice.AccountIdentification39Choice.mmBBAN,
						com.tools20022.repository.choice.AccountIdentification39Choice.mmUPIC, com.tools20022.repository.choice.AccountIdentification39Choice.mmDomestic,
						com.tools20022.repository.choice.AccountIdentification39Choice.mmOther);
				trace_lazy = () -> AccountIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountIdentification39Choice";
				definition = "Identifier of an account, as assigned by the account servicer.";
				previousVersion_lazy = () -> AccountIdentification30Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Min8Max28NumericText getCard() {
		return card;
	}

	public AccountIdentification39Choice setCard(Min8Max28NumericText card) {
		this.card = Objects.requireNonNull(card);
		return this;
	}

	public Max16Text getMSISDN() {
		return mSISDN;
	}

	public AccountIdentification39Choice setMSISDN(Max16Text mSISDN) {
		this.mSISDN = Objects.requireNonNull(mSISDN);
		return this;
	}

	public Max256Text getEMail() {
		return eMail;
	}

	public AccountIdentification39Choice setEMail(Max256Text eMail) {
		this.eMail = Objects.requireNonNull(eMail);
		return this;
	}

	public IBANIdentifier getIBAN() {
		return iBAN;
	}

	public AccountIdentification39Choice setIBAN(IBANIdentifier iBAN) {
		this.iBAN = Objects.requireNonNull(iBAN);
		return this;
	}

	public BBANIdentifier getBBAN() {
		return bBAN;
	}

	public AccountIdentification39Choice setBBAN(BBANIdentifier bBAN) {
		this.bBAN = Objects.requireNonNull(bBAN);
		return this;
	}

	public UPICIdentifier getUPIC() {
		return uPIC;
	}

	public AccountIdentification39Choice setUPIC(UPICIdentifier uPIC) {
		this.uPIC = Objects.requireNonNull(uPIC);
		return this;
	}

	public Max35Text getDomestic() {
		return domestic;
	}

	public AccountIdentification39Choice setDomestic(Max35Text domestic) {
		this.domestic = Objects.requireNonNull(domestic);
		return this;
	}

	public Max35Text getOther() {
		return other;
	}

	public AccountIdentification39Choice setOther(Max35Text other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}