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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the securities reference data for the required financial
 * instruments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmTechnicalRecordIdentification
 * SecuritiesReferenceDataReport5.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmFinancialInstrumentGeneralAttributes
 * SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmIssuer
 * SecuritiesReferenceDataReport5.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmTradingVenueRelatedAttributes
 * SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmDebtInstrumentAttributes
 * SecuritiesReferenceDataReport5.mmDebtInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmDerivativeInstrumentAttributes
 * SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmTechnicalAttributes
 * SecuritiesReferenceDataReport5.mmTechnicalAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataReportV01#mmReferenceData
 * FinancialInstrumentReportingReferenceDataReportV01.mmReferenceData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidDebtMaturityDateRule#forSecuritiesReferenceDataReport5
 * ConstraintValidDebtMaturityDateRule.forSecuritiesReferenceDataReport5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValidDerivativeExpiryDateRule#forSecuritiesReferenceDataReport5
 * ConstraintValidDerivativeExpiryDateRule.forSecuritiesReferenceDataReport5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesReferenceDataReport5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the securities reference data for the required financial instruments."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesReferenceDataReport5", propOrder = {"technicalRecordIdentification", "financialInstrumentGeneralAttributes", "issuer", "tradingVenueRelatedAttributes", "debtInstrumentAttributes",
		"derivativeInstrumentAttributes", "technicalAttributes"})
public class SecuritiesReferenceDataReport5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TechRcrdId")
	protected Max35Text technicalRecordIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a record in a message used as part of error management and status advice message.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReferenceDataReport5, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<SecuritiesReferenceDataReport5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and status advice message.\r\n\r\nUsage:\r\nThis identification will be used in the status advice report sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, Optional<Max35Text> value) {
			obj.setTechnicalRecordIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmGnlAttrbts", required = true)
	protected SecurityInstrumentDescription9 financialInstrumentGeneralAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9
	 * SecurityInstrumentDescription9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmGnlAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentGeneralAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attributes and characteristics of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDataReport5, SecurityInstrumentDescription9> mmFinancialInstrumentGeneralAttributes = new MMMessageAssociationEnd<SecuritiesReferenceDataReport5, SecurityInstrumentDescription9>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmGnlAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentGeneralAttributes";
			definition = "Attributes and characteristics of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityInstrumentDescription9.mmObject();
		}

		@Override
		public SecurityInstrumentDescription9 getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getFinancialInstrumentGeneralAttributes();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, SecurityInstrumentDescription9 value) {
			obj.setFinancialInstrumentGeneralAttributes(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected LEIIdentifier issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "LEI of Issuer or trading venue operator."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReferenceDataReport5, LEIIdentifier> mmIssuer = new MMMessageAttribute<SecuritiesReferenceDataReport5, LEIIdentifier>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "LEI of Issuer or trading venue operator.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, LEIIdentifier value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "TradgVnRltdAttrbts", required = true)
	protected List<TradingVenueAttributes1> tradingVenueRelatedAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgVnRltdAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingVenueRelatedAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Traded venue related attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDataReport5, List<TradingVenueAttributes1>> mmTradingVenueRelatedAttributes = new MMMessageAssociationEnd<SecuritiesReferenceDataReport5, List<TradingVenueAttributes1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "TradgVnRltdAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingVenueRelatedAttributes";
			definition = "Traded venue related attributes.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradingVenueAttributes1.mmObject();
		}

		@Override
		public List<TradingVenueAttributes1> getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getTradingVenueRelatedAttributes();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, List<TradingVenueAttributes1> value) {
			obj.setTradingVenueRelatedAttributes(value);
		}
	};
	@XmlElement(name = "DebtInstrmAttrbts")
	protected DebtInstrument2 debtInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DebtInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes specific to debt instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<DebtInstrument2>> mmDebtInstrumentAttributes = new MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<DebtInstrument2>>() {
		{
			businessComponentTrace_lazy = () -> Debt.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "DebtInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtInstrumentAttributes";
			definition = "Attributes specific to debt instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DebtInstrument2.mmObject();
		}

		@Override
		public Optional<DebtInstrument2> getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getDebtInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, Optional<DebtInstrument2> value) {
			obj.setDebtInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivInstrmAttrbts")
	protected DerivativeInstrument5 derivativeInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DerivativeInstrument5
	 * DerivativeInstrument5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes specific to derivative instruments."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<DerivativeInstrument5>> mmDerivativeInstrumentAttributes = new MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<DerivativeInstrument5>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmDerivative;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "DerivInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeInstrumentAttributes";
			definition = "Attributes specific to derivative instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DerivativeInstrument5.mmObject();
		}

		@Override
		public Optional<DerivativeInstrument5> getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getDerivativeInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, Optional<DerivativeInstrument5> value) {
			obj.setDerivativeInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "TechAttrbts")
	protected RecordTechnicalData3 technicalAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<RecordTechnicalData3>> mmTechnicalAttributes = new MMMessageAssociationEnd<SecuritiesReferenceDataReport5, Optional<RecordTechnicalData3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmObject();
			isDerived = false;
			xmlTag = "TechAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalAttributes";
			definition = "Technical attributes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecordTechnicalData3.mmObject();
		}

		@Override
		public Optional<RecordTechnicalData3> getValue(SecuritiesReferenceDataReport5 obj) {
			return obj.getTechnicalAttributes();
		}

		@Override
		public void setValue(SecuritiesReferenceDataReport5 obj, Optional<RecordTechnicalData3> value) {
			obj.setTechnicalAttributes(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmTechnicalRecordIdentification,
						com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmFinancialInstrumentGeneralAttributes, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmIssuer,
						com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmTradingVenueRelatedAttributes, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmDebtInstrumentAttributes,
						com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.mmTechnicalAttributes);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingReferenceDataReportV01.mmReferenceData);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValidDebtMaturityDateRule.forSecuritiesReferenceDataReport5,
						com.tools20022.repository.constraints.ConstraintValidDerivativeExpiryDateRule.forSecuritiesReferenceDataReport5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesReferenceDataReport5";
				definition = "Provides details on the securities reference data for the required financial instruments.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public SecuritiesReferenceDataReport5 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public SecurityInstrumentDescription9 getFinancialInstrumentGeneralAttributes() {
		return financialInstrumentGeneralAttributes;
	}

	public SecuritiesReferenceDataReport5 setFinancialInstrumentGeneralAttributes(SecurityInstrumentDescription9 financialInstrumentGeneralAttributes) {
		this.financialInstrumentGeneralAttributes = Objects.requireNonNull(financialInstrumentGeneralAttributes);
		return this;
	}

	public LEIIdentifier getIssuer() {
		return issuer;
	}

	public SecuritiesReferenceDataReport5 setIssuer(LEIIdentifier issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<TradingVenueAttributes1> getTradingVenueRelatedAttributes() {
		return tradingVenueRelatedAttributes == null ? tradingVenueRelatedAttributes = new ArrayList<>() : tradingVenueRelatedAttributes;
	}

	public SecuritiesReferenceDataReport5 setTradingVenueRelatedAttributes(List<TradingVenueAttributes1> tradingVenueRelatedAttributes) {
		this.tradingVenueRelatedAttributes = Objects.requireNonNull(tradingVenueRelatedAttributes);
		return this;
	}

	public Optional<DebtInstrument2> getDebtInstrumentAttributes() {
		return debtInstrumentAttributes == null ? Optional.empty() : Optional.of(debtInstrumentAttributes);
	}

	public SecuritiesReferenceDataReport5 setDebtInstrumentAttributes(DebtInstrument2 debtInstrumentAttributes) {
		this.debtInstrumentAttributes = debtInstrumentAttributes;
		return this;
	}

	public Optional<DerivativeInstrument5> getDerivativeInstrumentAttributes() {
		return derivativeInstrumentAttributes == null ? Optional.empty() : Optional.of(derivativeInstrumentAttributes);
	}

	public SecuritiesReferenceDataReport5 setDerivativeInstrumentAttributes(DerivativeInstrument5 derivativeInstrumentAttributes) {
		this.derivativeInstrumentAttributes = derivativeInstrumentAttributes;
		return this;
	}

	public Optional<RecordTechnicalData3> getTechnicalAttributes() {
		return technicalAttributes == null ? Optional.empty() : Optional.of(technicalAttributes);
	}

	public SecuritiesReferenceDataReport5 setTechnicalAttributes(RecordTechnicalData3 technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
		return this;
	}
}