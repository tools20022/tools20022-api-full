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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxDetails;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details about tax paid, or to be paid, to the government in accordance with
 * the law, including pre-defined parameters such as thresholds and type of
 * account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmCreditorTaxIdentification
 * TaxInformation2.mmCreditorTaxIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmCreditorTaxType
 * TaxInformation2.mmCreditorTaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmDebtorTaxIdentification
 * TaxInformation2.mmDebtorTaxIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxReferenceNumber
 * TaxInformation2.mmTaxReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTotalTaxableBaseAmount
 * TaxInformation2.mmTotalTaxableBaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTotalTaxAmount
 * TaxInformation2.mmTotalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxDate
 * TaxInformation2.mmTaxDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxTypeInformation
 * TaxInformation2.mmTaxTypeInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "TaxInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxInformation2", propOrder = {"creditorTaxIdentification", "creditorTaxType", "debtorTaxIdentification", "taxReferenceNumber", "totalTaxableBaseAmount", "totalTaxAmount", "taxDate", "taxTypeInformation"})
public class TaxInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CdtrTaxId")
	protected Max35Text creditorTaxIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrTaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorTaxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax Identification Number of the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<Max35Text>> mmCreditorTaxIdentification = new MMMessageAttribute<TaxInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrTaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorTaxIdentification";
			definition = "Tax Identification Number of the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxInformation2 obj) {
			return obj.getCreditorTaxIdentification();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<Max35Text> value) {
			obj.setCreditorTaxIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrTaxTp")
	protected Max35Text creditorTaxType;
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
	 * {@linkplain com.tools20022.repository.entity.Role#mmPlayer Role.mmPlayer}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrTaxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax payer (creditor)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<Max35Text>> mmCreditorTaxType = new MMMessageAttribute<TaxInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Role.mmPlayer;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrTaxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorTaxType";
			definition = "Type of tax payer (creditor).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxInformation2 obj) {
			return obj.getCreditorTaxType();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<Max35Text> value) {
			obj.setCreditorTaxType(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrTaxId")
	protected Max35Text debtorTaxIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrTaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorTaxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax Identification Number of the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<Max35Text>> mmDebtorTaxIdentification = new MMMessageAttribute<TaxInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "DbtrTaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorTaxIdentification";
			definition = "Tax Identification Number of the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxInformation2 obj) {
			return obj.getDebtorTaxIdentification();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<Max35Text> value) {
			obj.setDebtorTaxIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRefNb")
	protected Max140Text taxReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmIdentification
	 * Tax.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax reference information that is specific to a taxing agency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<Max140Text>> mmTaxReferenceNumber = new MMMessageAttribute<TaxInformation2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "TaxRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReferenceNumber";
			definition = "Tax reference information that is specific to a taxing agency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(TaxInformation2 obj) {
			return obj.getTaxReferenceNumber();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<Max140Text> value) {
			obj.setTaxReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlTaxblBaseAmt")
	protected CurrencyAndAmount totalTaxableBaseAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxblBaseAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<CurrencyAndAmount>> mmTotalTaxableBaseAmount = new MMMessageAttribute<TaxInformation2, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxblBaseAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableBaseAmount";
			definition = "Total amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(TaxInformation2 obj) {
			return obj.getTotalTaxableBaseAmount();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<CurrencyAndAmount> value) {
			obj.setTotalTaxableBaseAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlTaxAmt")
	protected CurrencyAndAmount totalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<CurrencyAndAmount>> mmTotalTaxAmount = new MMMessageAttribute<TaxInformation2, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxAmount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(TaxInformation2 obj) {
			return obj.getTotalTaxAmount();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<CurrencyAndAmount> value) {
			obj.setTotalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDt")
	protected ISODate taxDate;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation2, Optional<ISODate>> mmTaxDate = new MMMessageAttribute<TaxInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "TaxDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TaxInformation2 obj) {
			return obj.getTaxDate();
		}

		@Override
		public void setValue(TaxInformation2 obj, Optional<ISODate> value) {
			obj.setTaxDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxTpInf")
	protected List<TaxDetails> taxTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxDetails TaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2
	 * TaxInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of characteristics defining the type of tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxInformation2, List<TaxDetails>> mmTaxTypeInformation = new MMMessageAssociationEnd<TaxInformation2, List<TaxDetails>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxInformation2.mmObject();
			isDerived = false;
			xmlTag = "TaxTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTypeInformation";
			definition = "Set of characteristics defining the type of tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxDetails.mmObject();
		}

		@Override
		public List<TaxDetails> getValue(TaxInformation2 obj) {
			return obj.getTaxTypeInformation();
		}

		@Override
		public void setValue(TaxInformation2 obj, List<TaxDetails> value) {
			obj.setTaxTypeInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation2.mmCreditorTaxIdentification, com.tools20022.repository.msg.TaxInformation2.mmCreditorTaxType,
						com.tools20022.repository.msg.TaxInformation2.mmDebtorTaxIdentification, com.tools20022.repository.msg.TaxInformation2.mmTaxReferenceNumber, com.tools20022.repository.msg.TaxInformation2.mmTotalTaxableBaseAmount,
						com.tools20022.repository.msg.TaxInformation2.mmTotalTaxAmount, com.tools20022.repository.msg.TaxInformation2.mmTaxDate, com.tools20022.repository.msg.TaxInformation2.mmTaxTypeInformation);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxInformation2";
				definition = "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCreditorTaxIdentification() {
		return creditorTaxIdentification == null ? Optional.empty() : Optional.of(creditorTaxIdentification);
	}

	public TaxInformation2 setCreditorTaxIdentification(Max35Text creditorTaxIdentification) {
		this.creditorTaxIdentification = creditorTaxIdentification;
		return this;
	}

	public Optional<Max35Text> getCreditorTaxType() {
		return creditorTaxType == null ? Optional.empty() : Optional.of(creditorTaxType);
	}

	public TaxInformation2 setCreditorTaxType(Max35Text creditorTaxType) {
		this.creditorTaxType = creditorTaxType;
		return this;
	}

	public Optional<Max35Text> getDebtorTaxIdentification() {
		return debtorTaxIdentification == null ? Optional.empty() : Optional.of(debtorTaxIdentification);
	}

	public TaxInformation2 setDebtorTaxIdentification(Max35Text debtorTaxIdentification) {
		this.debtorTaxIdentification = debtorTaxIdentification;
		return this;
	}

	public Optional<Max140Text> getTaxReferenceNumber() {
		return taxReferenceNumber == null ? Optional.empty() : Optional.of(taxReferenceNumber);
	}

	public TaxInformation2 setTaxReferenceNumber(Max140Text taxReferenceNumber) {
		this.taxReferenceNumber = taxReferenceNumber;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalTaxableBaseAmount() {
		return totalTaxableBaseAmount == null ? Optional.empty() : Optional.of(totalTaxableBaseAmount);
	}

	public TaxInformation2 setTotalTaxableBaseAmount(CurrencyAndAmount totalTaxableBaseAmount) {
		this.totalTaxableBaseAmount = totalTaxableBaseAmount;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalTaxAmount() {
		return totalTaxAmount == null ? Optional.empty() : Optional.of(totalTaxAmount);
	}

	public TaxInformation2 setTotalTaxAmount(CurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
		return this;
	}

	public Optional<ISODate> getTaxDate() {
		return taxDate == null ? Optional.empty() : Optional.of(taxDate);
	}

	public TaxInformation2 setTaxDate(ISODate taxDate) {
		this.taxDate = taxDate;
		return this;
	}

	public List<TaxDetails> getTaxTypeInformation() {
		return taxTypeInformation == null ? taxTypeInformation = new ArrayList<>() : taxTypeInformation;
	}

	public TaxInformation2 setTaxTypeInformation(List<TaxDetails> taxTypeInformation) {
		this.taxTypeInformation = Objects.requireNonNull(taxTypeInformation);
		return this;
	}
}