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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Min2Max3AlphaText;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DateAndPlaceOfBirth;
import com.tools20022.repository.msg.PostalAddress18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information requested against money laundering for a transfer transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderName
 * AntiMoneyLaundering1.mmSenderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderAddress
 * AntiMoneyLaundering1.mmSenderAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderNationalIdentifier
 * AntiMoneyLaundering1.mmSenderNationalIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmNationalIdentifierCountry
 * AntiMoneyLaundering1.mmNationalIdentifierCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderPassportNumber
 * AntiMoneyLaundering1.mmSenderPassportNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmPassportIssuingCountry
 * AntiMoneyLaundering1.mmPassportIssuingCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderTaxIdentifier
 * AntiMoneyLaundering1.mmSenderTaxIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmTaxCountry
 * AntiMoneyLaundering1.mmTaxCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderCustomerIdentifier
 * AntiMoneyLaundering1.mmSenderCustomerIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmSenderDateAndPlaceOfBirth
 * AntiMoneyLaundering1.mmSenderDateAndPlaceOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmReceiverName
 * AntiMoneyLaundering1.mmReceiverName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1#mmTransactionReference
 * AntiMoneyLaundering1.mmTransactionReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardholderRole
 * CardholderRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AntiMoneyLaundering1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information requested against money laundering for a transfer transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AntiMoneyLaundering1", propOrder = {"senderName", "senderAddress", "senderNationalIdentifier", "nationalIdentifierCountry", "senderPassportNumber", "passportIssuingCountry", "senderTaxIdentifier", "taxCountry",
		"senderCustomerIdentifier", "senderDateAndPlaceOfBirth", "receiverName", "transactionReference"})
public class AntiMoneyLaundering1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SndrNm")
	protected Max70Text senderName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max70Text>> mmSenderName = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderName";
			definition = "Name of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderName();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max70Text> value) {
			obj.setSenderName(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrAdr")
	protected PostalAddress18 senderAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress18
	 * PostalAddress18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AntiMoneyLaundering1, Optional<PostalAddress18>> mmSenderAddress = new MMMessageAssociationEnd<AntiMoneyLaundering1, Optional<PostalAddress18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderAddress";
			definition = "Address of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress18.mmObject();
		}

		@Override
		public Optional<PostalAddress18> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderAddress();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<PostalAddress18> value) {
			obj.setSenderAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrNtlIdr")
	protected Max35Text senderNationalIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrNtlIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderNationalIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "National identifier number of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>> mmSenderNationalIdentifier = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrNtlIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderNationalIdentifier";
			definition = "National identifier number of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderNationalIdentifier();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max35Text> value) {
			obj.setSenderNationalIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "NtlIdrCtry")
	protected Min2Max3AlphaText nationalIdentifierCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3AlphaText
	 * Min2Max3AlphaText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtlIdrCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalIdentifierCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of the national identifier (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>> mmNationalIdentifierCountry = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "NtlIdrCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalIdentifierCountry";
			definition = "Country of the national identifier (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}

		@Override
		public Optional<Min2Max3AlphaText> getValue(AntiMoneyLaundering1 obj) {
			return obj.getNationalIdentifierCountry();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Min2Max3AlphaText> value) {
			obj.setNationalIdentifierCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrPsptNb")
	protected Max35Text senderPassportNumber;
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
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrPsptNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderPassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Passport number of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>> mmSenderPassportNumber = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrPsptNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderPassportNumber";
			definition = "Passport number of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderPassportNumber();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max35Text> value) {
			obj.setSenderPassportNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PsptIssgCtry")
	protected Min2Max3AlphaText passportIssuingCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3AlphaText
	 * Min2Max3AlphaText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PsptIssgCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportIssuingCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country issuing the passport (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>> mmPassportIssuingCountry = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "PsptIssgCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportIssuingCountry";
			definition = "Country issuing the passport (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}

		@Override
		public Optional<Min2Max3AlphaText> getValue(AntiMoneyLaundering1 obj) {
			return obj.getPassportIssuingCountry();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Min2Max3AlphaText> value) {
			obj.setPassportIssuingCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrTaxIdr")
	protected Max35Text senderTaxIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrTaxIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderTaxIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax identifier of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>> mmSenderTaxIdentifier = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrTaxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderTaxIdentifier";
			definition = "Tax identifier of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderTaxIdentifier();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max35Text> value) {
			obj.setSenderTaxIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCtry")
	protected Min2Max3AlphaText taxCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min2Max3AlphaText
	 * Min2Max3AlphaText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the tax (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>> mmTaxCountry = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Min2Max3AlphaText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "TaxCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCountry";
			definition = "Country of the tax (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}

		@Override
		public Optional<Min2Max3AlphaText> getValue(AntiMoneyLaundering1 obj) {
			return obj.getTaxCountry();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Min2Max3AlphaText> value) {
			obj.setTaxCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrCstmrIdr")
	protected Max35Text senderCustomerIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrCstmrIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderCustomerIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer identifier of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>> mmSenderCustomerIdentifier = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrCstmrIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderCustomerIdentifier";
			definition = "Customer identifier of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderCustomerIdentifier();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max35Text> value) {
			obj.setSenderCustomerIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrDtAndPlcOfBirth")
	protected DateAndPlaceOfBirth senderDateAndPlaceOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndPlaceOfBirth
	 * DateAndPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrDtAndPlcOfBirth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderDateAndPlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and place of birth of the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AntiMoneyLaundering1, Optional<DateAndPlaceOfBirth>> mmSenderDateAndPlaceOfBirth = new MMMessageAssociationEnd<AntiMoneyLaundering1, Optional<DateAndPlaceOfBirth>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrDtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderDateAndPlaceOfBirth";
			definition = "Date and place of birth of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndPlaceOfBirth.mmObject();
		}

		@Override
		public Optional<DateAndPlaceOfBirth> getValue(AntiMoneyLaundering1 obj) {
			return obj.getSenderDateAndPlaceOfBirth();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<DateAndPlaceOfBirth> value) {
			obj.setSenderDateAndPlaceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrNm")
	protected Max70Text receiverName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the receiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max70Text>> mmReceiverName = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "RcvrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverName";
			definition = "Name of the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getReceiverName();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max70Text> value) {
			obj.setReceiverName(value.orElse(null));
		}
	};
	@XmlElement(name = "TxRef")
	protected Max35Text transactionReference;
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
	 * {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction reference number for sender and the receiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>> mmTransactionReference = new MMMessageAttribute<AntiMoneyLaundering1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Unique transaction reference number for sender and the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AntiMoneyLaundering1 obj) {
			return obj.getTransactionReference();
		}

		@Override
		public void setValue(AntiMoneyLaundering1 obj, Optional<Max35Text> value) {
			obj.setTransactionReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderName, com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderAddress,
						com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderNationalIdentifier, com.tools20022.repository.msg.AntiMoneyLaundering1.mmNationalIdentifierCountry,
						com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderPassportNumber, com.tools20022.repository.msg.AntiMoneyLaundering1.mmPassportIssuingCountry,
						com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderTaxIdentifier, com.tools20022.repository.msg.AntiMoneyLaundering1.mmTaxCountry,
						com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderCustomerIdentifier, com.tools20022.repository.msg.AntiMoneyLaundering1.mmSenderDateAndPlaceOfBirth,
						com.tools20022.repository.msg.AntiMoneyLaundering1.mmReceiverName, com.tools20022.repository.msg.AntiMoneyLaundering1.mmTransactionReference);
				trace_lazy = () -> CardholderRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AntiMoneyLaundering1";
				definition = "Information requested against money laundering for a transfer transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max70Text> getSenderName() {
		return senderName == null ? Optional.empty() : Optional.of(senderName);
	}

	public AntiMoneyLaundering1 setSenderName(Max70Text senderName) {
		this.senderName = senderName;
		return this;
	}

	public Optional<PostalAddress18> getSenderAddress() {
		return senderAddress == null ? Optional.empty() : Optional.of(senderAddress);
	}

	public AntiMoneyLaundering1 setSenderAddress(PostalAddress18 senderAddress) {
		this.senderAddress = senderAddress;
		return this;
	}

	public Optional<Max35Text> getSenderNationalIdentifier() {
		return senderNationalIdentifier == null ? Optional.empty() : Optional.of(senderNationalIdentifier);
	}

	public AntiMoneyLaundering1 setSenderNationalIdentifier(Max35Text senderNationalIdentifier) {
		this.senderNationalIdentifier = senderNationalIdentifier;
		return this;
	}

	public Optional<Min2Max3AlphaText> getNationalIdentifierCountry() {
		return nationalIdentifierCountry == null ? Optional.empty() : Optional.of(nationalIdentifierCountry);
	}

	public AntiMoneyLaundering1 setNationalIdentifierCountry(Min2Max3AlphaText nationalIdentifierCountry) {
		this.nationalIdentifierCountry = nationalIdentifierCountry;
		return this;
	}

	public Optional<Max35Text> getSenderPassportNumber() {
		return senderPassportNumber == null ? Optional.empty() : Optional.of(senderPassportNumber);
	}

	public AntiMoneyLaundering1 setSenderPassportNumber(Max35Text senderPassportNumber) {
		this.senderPassportNumber = senderPassportNumber;
		return this;
	}

	public Optional<Min2Max3AlphaText> getPassportIssuingCountry() {
		return passportIssuingCountry == null ? Optional.empty() : Optional.of(passportIssuingCountry);
	}

	public AntiMoneyLaundering1 setPassportIssuingCountry(Min2Max3AlphaText passportIssuingCountry) {
		this.passportIssuingCountry = passportIssuingCountry;
		return this;
	}

	public Optional<Max35Text> getSenderTaxIdentifier() {
		return senderTaxIdentifier == null ? Optional.empty() : Optional.of(senderTaxIdentifier);
	}

	public AntiMoneyLaundering1 setSenderTaxIdentifier(Max35Text senderTaxIdentifier) {
		this.senderTaxIdentifier = senderTaxIdentifier;
		return this;
	}

	public Optional<Min2Max3AlphaText> getTaxCountry() {
		return taxCountry == null ? Optional.empty() : Optional.of(taxCountry);
	}

	public AntiMoneyLaundering1 setTaxCountry(Min2Max3AlphaText taxCountry) {
		this.taxCountry = taxCountry;
		return this;
	}

	public Optional<Max35Text> getSenderCustomerIdentifier() {
		return senderCustomerIdentifier == null ? Optional.empty() : Optional.of(senderCustomerIdentifier);
	}

	public AntiMoneyLaundering1 setSenderCustomerIdentifier(Max35Text senderCustomerIdentifier) {
		this.senderCustomerIdentifier = senderCustomerIdentifier;
		return this;
	}

	public Optional<DateAndPlaceOfBirth> getSenderDateAndPlaceOfBirth() {
		return senderDateAndPlaceOfBirth == null ? Optional.empty() : Optional.of(senderDateAndPlaceOfBirth);
	}

	public AntiMoneyLaundering1 setSenderDateAndPlaceOfBirth(DateAndPlaceOfBirth senderDateAndPlaceOfBirth) {
		this.senderDateAndPlaceOfBirth = senderDateAndPlaceOfBirth;
		return this;
	}

	public Optional<Max70Text> getReceiverName() {
		return receiverName == null ? Optional.empty() : Optional.of(receiverName);
	}

	public AntiMoneyLaundering1 setReceiverName(Max70Text receiverName) {
		this.receiverName = receiverName;
		return this;
	}

	public Optional<Max35Text> getTransactionReference() {
		return transactionReference == null ? Optional.empty() : Optional.of(transactionReference);
	}

	public AntiMoneyLaundering1 setTransactionReference(Max35Text transactionReference) {
		this.transactionReference = transactionReference;
		return this;
	}
}