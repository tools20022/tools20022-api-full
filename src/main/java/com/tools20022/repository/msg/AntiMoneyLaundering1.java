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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.datatype.Min2Max3AlphaText;
import com.tools20022.repository.entity.CardholderRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AntiMoneyLaundering1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information requested against money laundering for a transfer transaction."</li>
 * </ul>
 */
public class AntiMoneyLaundering1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max70Text senderName;
	/**
	 * Name of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderName";
			definition = "Name of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected PostalAddress18 senderAddress;
	/**
	 * Address of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSenderAddress = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderAddress";
			definition = "Address of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress18.mmObject();
		}
	};
	protected Max35Text senderNationalIdentifier;
	/**
	 * National identifier number of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderNationalIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "National identifier number of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderNationalIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrNtlIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderNationalIdentifier";
			definition = "National identifier number of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Min2Max3AlphaText nationalIdentifierCountry;
	/**
	 * Country of the national identifier (ISO 3166-1 alpha-2 or alpha-3).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalIdentifierCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of the national identifier (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationalIdentifierCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "NtlIdrCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalIdentifierCountry";
			definition = "Country of the national identifier (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}
	};
	protected Max35Text senderPassportNumber;
	/**
	 * Passport number of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderPassportNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Passport number of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderPassportNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrPsptNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderPassportNumber";
			definition = "Passport number of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Min2Max3AlphaText passportIssuingCountry;
	/**
	 * Country issuing the passport (ISO 3166-1 alpha-2 or alpha-3).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PassportIssuingCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country issuing the passport (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPassportIssuingCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "PsptIssgCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PassportIssuingCountry";
			definition = "Country issuing the passport (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}
	};
	protected Max35Text senderTaxIdentifier;
	/**
	 * Tax identifier of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderTaxIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax identifier of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderTaxIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrTaxIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderTaxIdentifier";
			definition = "Tax identifier of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Min2Max3AlphaText taxCountry;
	/**
	 * Country of the tax (ISO 3166-1 alpha-2 or alpha-3).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the tax (ISO 3166-1 alpha-2 or alpha-3)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "TaxCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCountry";
			definition = "Country of the tax (ISO 3166-1 alpha-2 or alpha-3).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min2Max3AlphaText.mmObject();
		}
	};
	protected Max35Text senderCustomerIdentifier;
	/**
	 * Customer identifier of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderCustomerIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer identifier of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderCustomerIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrCstmrIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderCustomerIdentifier";
			definition = "Customer identifier of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndPlaceOfBirth senderDateAndPlaceOfBirth;
	/**
	 * Date and place of birth of the sender.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderDateAndPlaceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and place of birth of the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSenderDateAndPlaceOfBirth = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "SndrDtAndPlcOfBirth";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderDateAndPlaceOfBirth";
			definition = "Date and place of birth of the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndPlaceOfBirth.mmObject();
		}
	};
	protected Max70Text receiverName;
	/**
	 * Name of the receiver.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the receiver."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiverName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "RcvrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverName";
			definition = "Name of the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max35Text transactionReference;
	/**
	 * Unique transaction reference number for sender and the receiver.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction reference number for sender and the receiver."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AntiMoneyLaundering1.mmObject();
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Unique transaction reference number for sender and the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AntiMoneyLaundering1";
				definition = "Information requested against money laundering for a transfer transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max70Text getSenderName() {
		return senderName;
	}

	public void setSenderName(Max70Text senderName) {
		this.senderName = senderName;
	}

	public PostalAddress18 getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(com.tools20022.repository.msg.PostalAddress18 senderAddress) {
		this.senderAddress = senderAddress;
	}

	public Max35Text getSenderNationalIdentifier() {
		return senderNationalIdentifier;
	}

	public void setSenderNationalIdentifier(Max35Text senderNationalIdentifier) {
		this.senderNationalIdentifier = senderNationalIdentifier;
	}

	public Min2Max3AlphaText getNationalIdentifierCountry() {
		return nationalIdentifierCountry;
	}

	public void setNationalIdentifierCountry(Min2Max3AlphaText nationalIdentifierCountry) {
		this.nationalIdentifierCountry = nationalIdentifierCountry;
	}

	public Max35Text getSenderPassportNumber() {
		return senderPassportNumber;
	}

	public void setSenderPassportNumber(Max35Text senderPassportNumber) {
		this.senderPassportNumber = senderPassportNumber;
	}

	public Min2Max3AlphaText getPassportIssuingCountry() {
		return passportIssuingCountry;
	}

	public void setPassportIssuingCountry(Min2Max3AlphaText passportIssuingCountry) {
		this.passportIssuingCountry = passportIssuingCountry;
	}

	public Max35Text getSenderTaxIdentifier() {
		return senderTaxIdentifier;
	}

	public void setSenderTaxIdentifier(Max35Text senderTaxIdentifier) {
		this.senderTaxIdentifier = senderTaxIdentifier;
	}

	public Min2Max3AlphaText getTaxCountry() {
		return taxCountry;
	}

	public void setTaxCountry(Min2Max3AlphaText taxCountry) {
		this.taxCountry = taxCountry;
	}

	public Max35Text getSenderCustomerIdentifier() {
		return senderCustomerIdentifier;
	}

	public void setSenderCustomerIdentifier(Max35Text senderCustomerIdentifier) {
		this.senderCustomerIdentifier = senderCustomerIdentifier;
	}

	public DateAndPlaceOfBirth getSenderDateAndPlaceOfBirth() {
		return senderDateAndPlaceOfBirth;
	}

	public void setSenderDateAndPlaceOfBirth(com.tools20022.repository.msg.DateAndPlaceOfBirth senderDateAndPlaceOfBirth) {
		this.senderDateAndPlaceOfBirth = senderDateAndPlaceOfBirth;
	}

	public Max70Text getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(Max70Text receiverName) {
		this.receiverName = receiverName;
	}

	public Max35Text getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(Max35Text transactionReference) {
		this.transactionReference = transactionReference;
	}
}