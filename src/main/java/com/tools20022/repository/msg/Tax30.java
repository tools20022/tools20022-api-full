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
import com.tools20022.repository.choice.ExemptionReason1Choice;
import com.tools20022.repository.choice.TaxAmountOrRate4Choice;
import com.tools20022.repository.choice.TaxType3Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification113;
import com.tools20022.repository.msg.TaxCalculationInformation9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmType Tax30.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmTax Tax30.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmCountry
 * Tax30.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionIndicator
 * Tax30.mmExemptionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionReason
 * Tax30.mmExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Tax30#mmRecipientIdentification
 * Tax30.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmTaxCalculationDetails
 * Tax30.mmTaxCalculationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
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
 * "Tax30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax34 Tax34}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Tax31 Tax31}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Tax30", propOrder = {"type", "tax", "country", "exemptionIndicator", "exemptionReason", "recipientIdentification", "taxCalculationDetails"})
public class Tax30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TaxType3Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxType3Choice
	 * TaxType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
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
	 * definition} = "Type of tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmType Tax34.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Tax31#mmType Tax31.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax30, TaxType3Choice> mmType = new MMMessageAttribute<Tax30, TaxType3Choice>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmType);
			previousVersion_lazy = () -> Tax31.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TaxType3Choice.mmObject();
		}

		@Override
		public TaxType3Choice getValue(Tax30 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Tax30 obj, TaxType3Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Tax")
	protected TaxAmountOrRate4Choice tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice
	 * TaxAmountOrRate4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax to be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Tax30, Optional<TaxAmountOrRate4Choice>> mmTax = new MMMessageAssociationEnd<Tax30, Optional<TaxAmountOrRate4Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Tax to be applied.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxAmountOrRate4Choice.mmObject();
		}

		@Override
		public Optional<TaxAmountOrRate4Choice> getValue(Tax30 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(Tax30 obj, Optional<TaxAmountOrRate4Choice> value) {
			obj.setTax(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country where the tax is due."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmCountry
	 * Tax34.mmCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Tax31#mmCountry
	 * Tax31.mmCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax30, Optional<CountryCode>> mmCountry = new MMMessageAttribute<Tax30, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Party.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country where the tax is due.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmCountry);
			previousVersion_lazy = () -> Tax31.mmCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Tax30 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(Tax30 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnInd", required = true)
	protected YesNoIndicator exemptionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmExemptionIndicator
	 * InvestmentFundTax.mmExemptionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmExemptionIndicator
	 * Tax34.mmExemptionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax30, YesNoIndicator> mmExemptionIndicator = new MMMessageAttribute<Tax30, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmExemptionIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "XmptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmExemptionIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Tax30 obj) {
			return obj.getExemptionIndicator();
		}

		@Override
		public void setValue(Tax30 obj, YesNoIndicator value) {
			obj.setExemptionIndicator(value);
		}
	};
	@XmlElement(name = "XmptnRsn")
	protected ExemptionReason1Choice exemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice
	 * ExemptionReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the tax exemption."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax34#mmExemptionReason
	 * Tax34.mmExemptionReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax30, Optional<ExemptionReason1Choice>> mmExemptionReason = new MMMessageAttribute<Tax30, Optional<ExemptionReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for the tax exemption.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmExemptionReason);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExemptionReason1Choice.mmObject();
		}

		@Override
		public Optional<ExemptionReason1Choice> getValue(Tax30 obj) {
			return obj.getExemptionReason();
		}

		@Override
		public void setValue(Tax30 obj, Optional<ExemptionReason1Choice> value) {
			obj.setExemptionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification113 recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax34#mmRecipientIdentification
	 * Tax34.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Tax31#mmRecipientIdentification
	 * Tax31.mmRecipientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax30, Optional<PartyIdentification113>> mmRecipientIdentification = new MMMessageAttribute<Tax30, Optional<PartyIdentification113>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmRecipientIdentification);
			previousVersion_lazy = () -> Tax31.mmRecipientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(Tax30 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(Tax30 obj, Optional<PartyIdentification113> value) {
			obj.setRecipientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxClctnDtls")
	protected TaxCalculationInformation9 taxCalculationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation9
	 * TaxCalculationInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax30
	 * Tax30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to calculate the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax34#mmTaxCalculationDetails
	 * Tax34.mmTaxCalculationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Tax31#mmTaxCalculationDetails
	 * Tax31.mmTaxCalculationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Tax30, Optional<TaxCalculationInformation9>> mmTaxCalculationDetails = new MMMessageAssociationEnd<Tax30, Optional<TaxCalculationInformation9>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax30.mmObject();
			isDerived = false;
			xmlTag = "TaxClctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculationDetails";
			definition = "Information used to calculate the tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax34.mmTaxCalculationDetails);
			previousVersion_lazy = () -> Tax31.mmTaxCalculationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCalculationInformation9.mmObject();
		}

		@Override
		public Optional<TaxCalculationInformation9> getValue(Tax30 obj) {
			return obj.getTaxCalculationDetails();
		}

		@Override
		public void setValue(Tax30 obj, Optional<TaxCalculationInformation9> value) {
			obj.setTaxCalculationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax30.mmType, com.tools20022.repository.msg.Tax30.mmTax, com.tools20022.repository.msg.Tax30.mmCountry,
						com.tools20022.repository.msg.Tax30.mmExemptionIndicator, com.tools20022.repository.msg.Tax30.mmExemptionReason, com.tools20022.repository.msg.Tax30.mmRecipientIdentification,
						com.tools20022.repository.msg.Tax30.mmTaxCalculationDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Tax30";
				definition = "Tax related to an investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(Tax34.mmObject());
				previousVersion_lazy = () -> Tax31.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TaxType3Choice getType() {
		return type;
	}

	public Tax30 setType(TaxType3Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<TaxAmountOrRate4Choice> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public Tax30 setTax(TaxAmountOrRate4Choice tax) {
		this.tax = tax;
		return this;
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public Tax30 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public Tax30 setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = Objects.requireNonNull(exemptionIndicator);
		return this;
	}

	public Optional<ExemptionReason1Choice> getExemptionReason() {
		return exemptionReason == null ? Optional.empty() : Optional.of(exemptionReason);
	}

	public Tax30 setExemptionReason(ExemptionReason1Choice exemptionReason) {
		this.exemptionReason = exemptionReason;
		return this;
	}

	public Optional<PartyIdentification113> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Tax30 setRecipientIdentification(PartyIdentification113 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public Optional<TaxCalculationInformation9> getTaxCalculationDetails() {
		return taxCalculationDetails == null ? Optional.empty() : Optional.of(taxCalculationDetails);
	}

	public Tax30 setTaxCalculationDetails(TaxCalculationInformation9 taxCalculationDetails) {
		this.taxCalculationDetails = taxCalculationDetails;
		return this;
	}
}