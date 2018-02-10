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
import com.tools20022.repository.choice.SecurityStatus2Choice;
import com.tools20022.repository.choice.SystemPartyIdentification1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.CFIIdentifier;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmFinancialInstrumentIdentification
 * SecuritiesSearchCriteria1.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmClassificationFinancialInstrument
 * SecuritiesSearchCriteria1.mmClassificationFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmMaturityDate
 * SecuritiesSearchCriteria1.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssueDate
 * SecuritiesSearchCriteria1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssueCurrency
 * SecuritiesSearchCriteria1.mmIssueCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmCountryOfIssue
 * SecuritiesSearchCriteria1.mmCountryOfIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmSecurityStatus
 * SecuritiesSearchCriteria1.mmSecurityStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmMaintainingCSD
 * SecuritiesSearchCriteria1.mmMaintainingCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmInvestorCSD
 * SecuritiesSearchCriteria1.mmInvestorCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmIssuerCSD
 * SecuritiesSearchCriteria1.mmIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmTechnicalIssuerCSD
 * SecuritiesSearchCriteria1.mmTechnicalIssuerCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1#mmCSD
 * SecuritiesSearchCriteria1.mmCSD}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Criteria for a query about securities reference data."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSearchCriteria1", propOrder = {"financialInstrumentIdentification", "classificationFinancialInstrument", "maturityDate", "issueDate", "issueCurrency", "countryOfIssue", "securityStatus", "maintainingCSD",
		"investorCSD", "issuerCSD", "technicalIssuerCSD", "cSD"})
public class SecuritiesSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Way(s) of identifying the security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Way(s) of identifying the security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	@XmlElement(name = "ClssfctnFinInstrm")
	protected CFIIdentifier classificationFinancialInstrument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIIdentifier
	 * CFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssfctnFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassificationFinancialInstrument = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CFIIdentifier.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 200, FIXSynonym: 541, FIXSynonym: 1079</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "200"), new FIXSynonym(this, "541"), new FIXSynonym(this, "1079"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateSearchChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 15</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which a security is issued or redenominated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssueCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "15"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfIsse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 470</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where a security is issued by the issuer or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfIssue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "470"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "SctySts")
	protected SecurityStatus2Choice securityStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityStatus2Choice
	 * SecurityStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 965</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the security within its lifecycle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "965"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityStatus2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntngCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintainingCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMaintainingCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MntngCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintainingCSD";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechIssrCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTechnicalIssuerCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSearchCriteria1
	 * SecuritiesSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD of a security"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCSD = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSD";
			definition = "CSD of a security";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmClassificationFinancialInstrument, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmMaturityDate,
						com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmIssueDate, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmIssueCurrency, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmCountryOfIssue,
						com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmSecurityStatus, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmMaintainingCSD,
						com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmInvestorCSD, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmIssuerCSD,
						com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmTechnicalIssuerCSD, com.tools20022.repository.msg.SecuritiesSearchCriteria1.mmCSD);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesSearchCriteria1";
				definition = "Criteria for a query about securities reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public SecuritiesSearchCriteria1 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<CFIIdentifier> getClassificationFinancialInstrument() {
		return classificationFinancialInstrument == null ? Optional.empty() : Optional.of(classificationFinancialInstrument);
	}

	public SecuritiesSearchCriteria1 setClassificationFinancialInstrument(CFIIdentifier classificationFinancialInstrument) {
		this.classificationFinancialInstrument = classificationFinancialInstrument;
		return this;
	}

	public Optional<DateSearchChoice> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public SecuritiesSearchCriteria1 setMaturityDate(DateSearchChoice maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<DateSearchChoice> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public SecuritiesSearchCriteria1 setIssueDate(DateSearchChoice issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getIssueCurrency() {
		return issueCurrency == null ? Optional.empty() : Optional.of(issueCurrency);
	}

	public SecuritiesSearchCriteria1 setIssueCurrency(ActiveOrHistoricCurrencyCode issueCurrency) {
		this.issueCurrency = issueCurrency;
		return this;
	}

	public Optional<CountryCode> getCountryOfIssue() {
		return countryOfIssue == null ? Optional.empty() : Optional.of(countryOfIssue);
	}

	public SecuritiesSearchCriteria1 setCountryOfIssue(CountryCode countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
		return this;
	}

	public Optional<SecurityStatus2Choice> getSecurityStatus() {
		return securityStatus == null ? Optional.empty() : Optional.of(securityStatus);
	}

	public SecuritiesSearchCriteria1 setSecurityStatus(SecurityStatus2Choice securityStatus) {
		this.securityStatus = securityStatus;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getMaintainingCSD() {
		return maintainingCSD == null ? Optional.empty() : Optional.of(maintainingCSD);
	}

	public SecuritiesSearchCriteria1 setMaintainingCSD(SystemPartyIdentification1Choice maintainingCSD) {
		this.maintainingCSD = maintainingCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getInvestorCSD() {
		return investorCSD == null ? Optional.empty() : Optional.of(investorCSD);
	}

	public SecuritiesSearchCriteria1 setInvestorCSD(SystemPartyIdentification1Choice investorCSD) {
		this.investorCSD = investorCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getIssuerCSD() {
		return issuerCSD == null ? Optional.empty() : Optional.of(issuerCSD);
	}

	public SecuritiesSearchCriteria1 setIssuerCSD(SystemPartyIdentification1Choice issuerCSD) {
		this.issuerCSD = issuerCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getTechnicalIssuerCSD() {
		return technicalIssuerCSD == null ? Optional.empty() : Optional.of(technicalIssuerCSD);
	}

	public SecuritiesSearchCriteria1 setTechnicalIssuerCSD(SystemPartyIdentification1Choice technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
		return this;
	}

	public Optional<SystemPartyIdentification1Choice> getCSD() {
		return cSD == null ? Optional.empty() : Optional.of(cSD);
	}

	public SecuritiesSearchCriteria1 setCSD(SystemPartyIdentification1Choice cSD) {
		this.cSD = cSD;
		return this;
	}
}