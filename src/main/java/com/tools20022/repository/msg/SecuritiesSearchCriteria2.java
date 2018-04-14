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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.choice.SecurityStatus3Choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Criteria for a query about securities reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmFinancialInstrumentIdentification
 * SecuritiesSearchCriteria2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmClassificationFinancialInstrument
 * SecuritiesSearchCriteria2.mmClassificationFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmMaturityDate
 * SecuritiesSearchCriteria2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmIssueDate
 * SecuritiesSearchCriteria2.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmIssueCurrency
 * SecuritiesSearchCriteria2.mmIssueCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmCountryOfIssue
 * SecuritiesSearchCriteria2.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmSecurityStatus
 * SecuritiesSearchCriteria2.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmMaintainingCSD
 * SecuritiesSearchCriteria2.mmMaintainingCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmInvestorCSD
 * SecuritiesSearchCriteria2.mmInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmIssuerCSD
 * SecuritiesSearchCriteria2.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmTechnicalIssuerCSD
 * SecuritiesSearchCriteria2.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2#mmCSD
 * SecuritiesSearchCriteria2.mmCSD}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSearchCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Criteria for a query about securities reference data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
 * SecuritiesSearchCriteria1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSearchCriteria2", propOrder = {"financialInstrumentIdentification", "classificationFinancialInstrument", "maturityDate", "issueDate", "issueCurrency", "countryOfIssue", "securityStatus", "maintainingCSD",
		"investorCSD", "issuerCSD", "technicalIssuerCSD", "cSD"})
public class SecuritiesSearchCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmFinancialInstrumentIdentification
	 * SecuritiesSearchCriteria1.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SecurityIdentification19>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SecurityIdentification19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SecurityIdentification19> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssfctnFinInstrm")
	protected CFIOct2015Identifier classificationFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmClassificationFinancialInstrument
	 * SecuritiesSearchCriteria1.mmClassificationFinancialInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<CFIOct2015Identifier>> mmClassificationFinancialInstrument = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<CFIOct2015Identifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmClassificationFinancialInstrument;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}

		@Override
		public Optional<CFIOct2015Identifier> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getClassificationFinancialInstrument();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<CFIOct2015Identifier> value) {
			obj.setClassificationFinancialInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected DateSearchChoice maturityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmMaturityDate
	 * SecuritiesSearchCriteria1.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<DateSearchChoice>> mmMaturityDate = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "200"), new FIXSynonym(this, "541"), new FIXSynonym(this, "1079"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<DateSearchChoice> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDt")
	protected DateSearchChoice issueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssueDate
	 * SecuritiesSearchCriteria1.mmIssueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<DateSearchChoice>> mmIssueDate = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<DateSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmIssueDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<DateSearchChoice> value) {
			obj.setIssueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseCcy")
	protected ActiveOrHistoricCurrencyCode issueCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssueCurrency
	 * SecuritiesSearchCriteria1.mmIssueCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<ActiveOrHistoricCurrencyCode>> mmIssueCurrency = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IsseCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmIssueCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getIssueCurrency();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setIssueCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfIsse")
	protected CountryCode countryOfIssue;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmCountryOfIssue
	 * SecuritiesSearchCriteria1.mmCountryOfIssue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<CountryCode>> mmCountryOfIssue = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmCountryOfIssue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getCountryOfIssue();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<CountryCode> value) {
			obj.setCountryOfIssue(value.orElse(null));
		}
	};
	@XmlElement(name = "SctySts")
	protected SecurityStatus3Choice securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityStatus3Choice
	 * SecurityStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmSecurityStatus
	 * SecuritiesSearchCriteria1.mmSecurityStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesSearchCriteria2, Optional<SecurityStatus3Choice>> mmSecurityStatus = new MMMessageAttribute<SecuritiesSearchCriteria2, Optional<SecurityStatus3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmSecurityStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityStatus3Choice.mmObject();
		}

		@Override
		public Optional<SecurityStatus3Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getSecurityStatus();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SecurityStatus3Choice> value) {
			obj.setSecurityStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "MntngCSD")
	protected SystemPartyIdentification1Choice maintainingCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntngCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintainingCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmMaintainingCSD
	 * SecuritiesSearchCriteria1.mmMaintainingCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>> mmMaintainingCSD = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MntngCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintainingCSD";
			definition = "Entity involved in an activity.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmMaintainingCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getMaintainingCSD();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setMaintainingCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstrCSD")
	protected SystemPartyIdentification1Choice investorCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmInvestorCSD
	 * SecuritiesSearchCriteria1.mmInvestorCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>> mmInvestorCSD = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "Entity involved in an activity.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmInvestorCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getInvestorCSD();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setInvestorCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrCSD")
	protected SystemPartyIdentification1Choice issuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssuerCSD
	 * SecuritiesSearchCriteria1.mmIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>> mmIssuerCSD = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "Entity involved in an activity.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmIssuerCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getIssuerCSD();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setIssuerCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "TechIssrCSD")
	protected SystemPartyIdentification1Choice technicalIssuerCSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmTechnicalIssuerCSD
	 * SecuritiesSearchCriteria1.mmTechnicalIssuerCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>> mmTechnicalIssuerCSD = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmTechnicalIssuerCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getTechnicalIssuerCSD();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setTechnicalIssuerCSD(value.orElse(null));
		}
	};
	@XmlElement(name = "CSD")
	protected SystemPartyIdentification1Choice cSD;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemPartyIdentification1Choice
	 * SystemPartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria2
	 * SecuritiesSearchCriteria2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmCSD
	 * SecuritiesSearchCriteria1.mmCSD}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>> mmCSD = new MMMessageAssociationEnd<SecuritiesSearchCriteria2, Optional<SystemPartyIdentification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSD";
			definition = "CSD of a security.";
			previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmCSD;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification1Choice> getValue(SecuritiesSearchCriteria2 obj) {
			return obj.getCSD();
		}

		@Override
		public void setValue(SecuritiesSearchCriteria2 obj, Optional<SystemPartyIdentification1Choice> value) {
			obj.setCSD(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmClassificationFinancialInstrument, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmMaturityDate,
						com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmIssueDate, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmIssueCurrency, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmCountryOfIssue,
						com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmSecurityStatus, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmMaintainingCSD,
						com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmInvestorCSD, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmIssuerCSD,
						com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecuritiesSearchCriteria2.mmCSD);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesSearchCriteria2";
				definition = "Criteria for a query about securities reference data.";
				previousVersion_lazy = () -> SecuritiesSearchCriteria1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public SecuritiesSearchCriteria2 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<CFIOct2015Identifier> getClassificationFinancialInstrument() {
		return classificationFinancialInstrument == null ? Optional.empty() : Optional.of(classificationFinancialInstrument);
	}

	public SecuritiesSearchCriteria2 setClassificationFinancialInstrument(CFIOct2015Identifier classificationFinancialInstrument) {
		this.classificationFinancialInstrument = classificationFinancialInstrument;
		return this;
	}

	public Optional<DateSearchChoice> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public SecuritiesSearchCriteria2 setMaturityDate(DateSearchChoice maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<DateSearchChoice> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public SecuritiesSearchCriteria2 setIssueDate(DateSearchChoice issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getIssueCurrency() {
		return issueCurrency == null ? Optional.empty() : Optional.of(issueCurrency);
	}

	public SecuritiesSearchCriteria2 setIssueCurrency(ActiveOrHistoricCurrencyCode issueCurrency) {
		this.issueCurrency = issueCurrency;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public SecuritiesSearchCriteria2 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<SecurityStatus3Choice> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public SecuritiesSearchCriteria2 setSecurityStatus(SecurityStatus3Choice securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getMaintainingCSD() {
		return maintainingCSD == null ? Optional.empty() : Optional.of(maintainingCSD);
	}

	public SecuritiesSearchCriteria2 setMaintainingCSD(SystemPartyIdentification1Choice maintainingCSD) {
		this.maintainingCSD = maintainingCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getInvestorCSD() {
		return investorCSD == null ? Optional.empty() : Optional.of(investorCSD);
	}

	public SecuritiesSearchCriteria2 setInvestorCSD(SystemPartyIdentification1Choice investorCSD) {
		this.investorCSD = investorCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getIssuerCSD() {
		return issuerCSD == null ? Optional.empty() : Optional.of(issuerCSD);
	}

	public SecuritiesSearchCriteria2 setIssuerCSD(SystemPartyIdentification1Choice issuerCSD) {
		this.issuerCSD = issuerCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getTechnicalIssuerCSD() {
		return technicalIssuerCSD == null ? Optional.empty() : Optional.of(technicalIssuerCSD);
	}

	public SecuritiesSearchCriteria2 setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getCSD() {
		return cSD == null ? Optional.empty() : Optional.of(cSD);
	}

	public SecuritiesSearchCriteria2 setCSD(SystemPartyIdentification1Choice cSD) {
		this.cSD = cSD;
		return this;
	}
}