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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Return criteria for information to be returned in the report deriving from a
 * query about securities reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmFinancialInstrumentIdentification
 * SecuritiesReturnCriteria1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmISOSecurityLongName
 * SecuritiesReturnCriteria1.mmISOSecurityLongName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmISOSecurityShortName
 * SecuritiesReturnCriteria1.mmISOSecurityShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmClassificationFinancialInstrument
 * SecuritiesReturnCriteria1.mmClassificationFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmMaturityDate
 * SecuritiesReturnCriteria1.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmIssueDate
 * SecuritiesReturnCriteria1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmIssueCurrency
 * SecuritiesReturnCriteria1.mmIssueCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmCountryOfIssue
 * SecuritiesReturnCriteria1.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmSecurityStatus
 * SecuritiesReturnCriteria1.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmInvestorCSD
 * SecuritiesReturnCriteria1.mmInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmIssuerCSD
 * SecuritiesReturnCriteria1.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmTechnicalIssuerCSD
 * SecuritiesReturnCriteria1.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmCSD
 * SecuritiesReturnCriteria1.mmCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmSecuritiesQuantityType
 * SecuritiesReturnCriteria1.mmSecuritiesQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmMinimumDenomination
 * SecuritiesReturnCriteria1.mmMinimumDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmMinimumMultipleQuantity
 * SecuritiesReturnCriteria1.mmMinimumMultipleQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1#mmDeviatingSettlementUnit
 * SecuritiesReturnCriteria1.mmDeviatingSettlementUnit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Return criteria for information to be returned in the report deriving from a query about securities reference data."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesReturnCriteria1", propOrder = {"financialInstrumentIdentification", "iSOSecurityLongName", "iSOSecurityShortName", "classificationFinancialInstrument", "maturityDate", "issueDate", "issueCurrency",
		"countryOfIssue", "securityStatus", "investorCSD", "issuerCSD", "technicalIssuerCSD", "cSD", "securitiesQuantityType", "minimumDenomination", "minimumMultipleQuantity", "deviatingSettlementUnit"})
public class SecuritiesReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId", required = true)
	protected RequestedIndicator financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmFinancialInstrumentIdentification = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "ISOSctyLngNm", required = true)
	protected RequestedIndicator iSOSecurityLongName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyLngNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmISOSecurityLongName = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyLngNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityLongName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getISOSecurityLongName();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setISOSecurityLongName(value);
		}
	};
	@XmlElement(name = "ISOSctyShrtNm", required = true)
	protected RequestedIndicator iSOSecurityShortName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISOSctyShrtNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security expressed as ISO 18773/18774."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmISOSecurityShortName = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityShortName";
			definition = "Short name of the security expressed as ISO 18773/18774.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getISOSecurityShortName();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setISOSecurityShortName(value);
		}
	};
	@XmlElement(name = "ClssfctnFinInstrm", required = true)
	protected RequestedIndicator classificationFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnFinInstrm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmClassificationFinancialInstrument = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getClassificationFinancialInstrument();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setClassificationFinancialInstrument(value);
		}
	};
	@XmlElement(name = "MtrtyDt", required = true)
	protected RequestedIndicator maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 200, FIXSynonym: 541, FIXSynonym: 1079</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmMaturityDate = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "200"), new FIXSynonym(this, "541"), new FIXSynonym(this, "1079"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setMaturityDate(value);
		}
	};
	@XmlElement(name = "IsseDt", required = true)
	protected RequestedIndicator issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmIssueDate = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setIssueDate(value);
		}
	};
	@XmlElement(name = "IsseCcy", required = true)
	protected RequestedIndicator issueCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmIssueCurrency = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getIssueCurrency();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setIssueCurrency(value);
		}
	};
	@XmlElement(name = "CtryOfIsse", required = true)
	protected RequestedIndicator countryOfIssue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where a security is issued by the issuer or its agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmCountryOfIssue = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setCountryOfIssue(value);
		}
	};
	@XmlElement(name = "SctySts", required = true)
	protected RequestedIndicator securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 965</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmSecurityStatus = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getSecurityStatus();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setSecurityStatus(value);
		}
	};
	@XmlElement(name = "InvstrCSD", required = true)
	protected RequestedIndicator investorCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Investor of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmInvestorCSD = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "CSD Investor of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getInvestorCSD();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setInvestorCSD(value);
		}
	};
	@XmlElement(name = "IssrCSD", required = true)
	protected RequestedIndicator issuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmIssuerCSD = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "CSD Issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getIssuerCSD();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setIssuerCSD(value);
		}
	};
	@XmlElement(name = "TechIssrCSD", required = true)
	protected RequestedIndicator technicalIssuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechIssrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmTechnicalIssuerCSD = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getTechnicalIssuerCSD();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setTechnicalIssuerCSD(value);
		}
	};
	@XmlElement(name = "CSD", required = true)
	protected RequestedIndicator cSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmCSD = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSD";
			definition = "CSD of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getCSD();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setCSD(value);
		}
	};
	@XmlElement(name = "SctiesQtyTp", required = true)
	protected RequestedIndicator securitiesQuantityType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesQtyTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmSecuritiesQuantityType = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityType";
			definition = "Quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getSecuritiesQuantityType();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setSecuritiesQuantityType(value);
		}
	};
	@XmlElement(name = "MinDnmtn", required = true)
	protected RequestedIndicator minimumDenomination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinDnmtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum quantity (unit or nominal) of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmMinimumDenomination = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MinDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum quantity (unit or nominal) of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getMinimumDenomination();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setMinimumDenomination(value);
		}
	};
	@XmlElement(name = "MinMltplQty", required = true)
	protected RequestedIndicator minimumMultipleQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMltplQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (unit or nominal) of securities."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmMinimumMultipleQuantity = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantity";
			definition = "Minimum multiple quantity (unit or nominal) of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getMinimumMultipleQuantity();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setMinimumMultipleQuantity(value);
		}
	};
	@XmlElement(name = "DevtgSttlmUnit", required = true)
	protected RequestedIndicator deviatingSettlementUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReturnCriteria1
	 * SecuritiesReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DevtgSttlmUnit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviatingSettlementUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125 shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator> mmDeviatingSettlementUnit = new MMMessageAttribute<SecuritiesReturnCriteria1, RequestedIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DevtgSttlmUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviatingSettlementUnit";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125 shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public RequestedIndicator getValue(SecuritiesReturnCriteria1 obj) {
			return obj.getDeviatingSettlementUnit();
		}

		@Override
		public void setValue(SecuritiesReturnCriteria1 obj, RequestedIndicator value) {
			obj.setDeviatingSettlementUnit(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmISOSecurityLongName,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmISOSecurityShortName, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmClassificationFinancialInstrument,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmMaturityDate, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmIssueDate, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmIssueCurrency,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmCountryOfIssue, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmSecurityStatus,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmInvestorCSD, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmIssuerCSD,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmCSD,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmSecuritiesQuantityType, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmMinimumDenomination,
						com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmMinimumMultipleQuantity, com.tools20022.repository.msg.SecuritiesReturnCriteria1.mmDeviatingSettlementUnit);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesReturnCriteria1";
				definition = "Return criteria for information to be returned in the report deriving from a query about securities reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public RequestedIndicator getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesReturnCriteria1 setFinancialInstrumentIdentification(RequestedIndicator financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public RequestedIndicator getISOSecurityLongName() {
		return iSOSecurityLongName;
	}

	public SecuritiesReturnCriteria1 setISOSecurityLongName(RequestedIndicator iSOSecurityLongName) {
		this.iSOSecurityLongName = Objects.requireNonNull(iSOSecurityLongName);
		return this;
	}

	public RequestedIndicator getISOSecurityShortName() {
		return iSOSecurityShortName;
	}

	public SecuritiesReturnCriteria1 setISOSecurityShortName(RequestedIndicator iSOSecurityShortName) {
		this.iSOSecurityShortName = Objects.requireNonNull(iSOSecurityShortName);
		return this;
	}

	public RequestedIndicator getClassificationFinancialInstrument() {
		return classificationFinancialInstrument;
	}

	public SecuritiesReturnCriteria1 setClassificationFinancialInstrument(RequestedIndicator classificationFinancialInstrument) {
		this.classificationFinancialInstrument = Objects.requireNonNull(classificationFinancialInstrument);
		return this;
	}

	public RequestedIndicator getMaturityDate() {
		return maturityDate;
	}

	public SecuritiesReturnCriteria1 setMaturityDate(RequestedIndicator maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public RequestedIndicator getIssueDate() {
		return issueDate;
	}

	public SecuritiesReturnCriteria1 setIssueDate(RequestedIndicator issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public RequestedIndicator getIssueCurrency() {
		return issueCurrency;
	}

	public SecuritiesReturnCriteria1 setIssueCurrency(RequestedIndicator issueCurrency) {
		this.issueCurrency = Objects.requireNonNull(issueCurrency);
		return this;
	}

	public RequestedIndicator getCountryOfIssue() {
		return countryOfIssue;
	}

	public SecuritiesReturnCriteria1 setCountryOfIssue(RequestedIndicator countryOfIssue) {
		this.countryOfIssue = Objects.requireNonNull(countryOfIssue);
		return this;
	}

	public RequestedIndicator getSecurityStatus() {
		return securityStatus;
	}

	public SecuritiesReturnCriteria1 setSecurityStatus(RequestedIndicator securityStatus) {
		this.securityStatus = Objects.requireNonNull(securityStatus);
		return this;
	}

	public RequestedIndicator getInvestorCSD() {
		return investorCSD;
	}

	public SecuritiesReturnCriteria1 setInvestorCSD(RequestedIndicator investorCSD) {
		this.investorCSD = Objects.requireNonNull(investorCSD);
		return this;
	}

	public RequestedIndicator getIssuerCSD() {
		return issuerCSD;
	}

	public SecuritiesReturnCriteria1 setIssuerCSD(RequestedIndicator issuerCSD) {
		this.issuerCSD = Objects.requireNonNull(issuerCSD);
		return this;
	}

	public RequestedIndicator getTechnicalIssuerCSD() {
		return technicalIssuerCSD;
	}

	public SecuritiesReturnCriteria1 setTechnicalIssuerCSD(RequestedIndicator technicalIssuerCSD) {
		this.technicalIssuerCSD = Objects.requireNonNull(technicalIssuerCSD);
		return this;
	}

	public RequestedIndicator getCSD() {
		return cSD;
	}

	public SecuritiesReturnCriteria1 setCSD(RequestedIndicator cSD) {
		this.cSD = Objects.requireNonNull(cSD);
		return this;
	}

	public RequestedIndicator getSecuritiesQuantityType() {
		return securitiesQuantityType;
	}

	public SecuritiesReturnCriteria1 setSecuritiesQuantityType(RequestedIndicator securitiesQuantityType) {
		this.securitiesQuantityType = Objects.requireNonNull(securitiesQuantityType);
		return this;
	}

	public RequestedIndicator getMinimumDenomination() {
		return minimumDenomination;
	}

	public SecuritiesReturnCriteria1 setMinimumDenomination(RequestedIndicator minimumDenomination) {
		this.minimumDenomination = Objects.requireNonNull(minimumDenomination);
		return this;
	}

	public RequestedIndicator getMinimumMultipleQuantity() {
		return minimumMultipleQuantity;
	}

	public SecuritiesReturnCriteria1 setMinimumMultipleQuantity(RequestedIndicator minimumMultipleQuantity) {
		this.minimumMultipleQuantity = Objects.requireNonNull(minimumMultipleQuantity);
		return this;
	}

	public RequestedIndicator getDeviatingSettlementUnit() {
		return deviatingSettlementUnit;
	}

	public SecuritiesReturnCriteria1 setDeviatingSettlementUnit(RequestedIndicator deviatingSettlementUnit) {
		this.deviatingSettlementUnit = Objects.requireNonNull(deviatingSettlementUnit);
		return this;
	}
}