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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Return criteria for information to be returned in the report deriving from a query about securities reference data."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesReturnCriteria1", propOrder = {"financialInstrumentIdentification", "ISOSecurityLongName", "ISOSecurityShortName", "classificationFinancialInstrument", "maturityDate", "issueDate", "issueCurrency",
		"countryOfIssue", "securityStatus", "investorCSD", "issuerCSD", "technicalIssuerCSD", "CSD", "securitiesQuantityType", "minimumDenomination", "minimumMultipleQuantity", "deviatingSettlementUnit"})
public class SecuritiesReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator financialInstrumentIdentification;
	/**
	 * Identification of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator iSOSecurityLongName;
	/**
	 * Name of the security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityLongName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISOSecurityLongName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyLngNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityLongName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator iSOSecurityShortName;
	/**
	 * Short name of the security expressed as ISO 18773/18774.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISOSecurityShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security expressed as ISO 18773/18774."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISOSecurityShortName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ISOSctyShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISOSecurityShortName";
			definition = "Short name of the security expressed as ISO 18773/18774.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator classificationFinancialInstrument;
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification, for example,
	 * common share with voting rights, fully paid, or registered.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClssfctnFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationFinancialInstrument";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator maturityDate;
	/**
	 * Planned final repayment date at the time of issuance.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator issueDate;
	/**
	 * Date/time at which the security was made available.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator issueCurrency;
	/**
	 * Currency in which a security is issued or redenominated.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IsseCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueCurrency";
			definition = "Currency in which a security is issued or redenominated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator countryOfIssue;
	/**
	 * Primary market or country where a security is issued by the issuer or its
	 * agent.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfIsse";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfIssue";
			definition = "Primary market or country where a security is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator securityStatus;
	/**
	 * Specifies the status of the security within its lifecycle.
	 * <p>
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
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityStatus";
			definition = "Specifies the status of the security within its lifecycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator investorCSD;
	/**
	 * CSD Investor of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Investor of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorCSD = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "InvstrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCSD";
			definition = "CSD Investor of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator issuerCSD;
	/**
	 * CSD Issuer of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CSD Issuer of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerCSD = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCSD";
			definition = "CSD Issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator technicalIssuerCSD;
	/**
	 * Technical issuer of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalIssuerCSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical issuer of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTechnicalIssuerCSD = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "TechIssrCSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalIssuerCSD";
			definition = "Technical issuer of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator cSD;
	/**
	 * CSD of a security
	 * <p>
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
	public static final MMMessageAttribute mmCSD = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CSD";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSD";
			definition = "CSD of a security";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator securitiesQuantityType;
	/**
	 * Quantity of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesQuantityType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SctiesQtyTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesQuantityType";
			definition = "Quantity of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator minimumDenomination;
	/**
	 * Indicates the minimum quantity (unit or nominal) of a security.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the minimum quantity (unit or nominal) of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumDenomination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MinDnmtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumDenomination";
			definition = "Indicates the minimum quantity (unit or nominal) of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator minimumMultipleQuantity;
	/**
	 * Minimum multiple quantity (unit or nominal) of securities.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum multiple quantity (unit or nominal) of securities."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMultipleQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MinMltplQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMultipleQuantity";
			definition = "Minimum multiple quantity (unit or nominal) of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator deviatingSettlementUnit;
	/**
	 * Minimum quantity of securities that can be purchased without incurring a
	 * larger fee. For example, if the round lot size is 100 and the trade is
	 * for 125 shares, then 100 will be processed without a fee and the
	 * remaining 25 will incur a service fee for being an odd lot size.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviatingSettlementUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeviatingSettlementUnit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "DevtgSttlmUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviatingSettlementUnit";
			definition = "Minimum quantity of securities that can be purchased without incurring a larger fee. For example, if the round lot size is 100 and the trade is for 125  shares, then 100 will be processed without a fee and the remaining 25 will incur a service fee for being an odd lot size.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesReturnCriteria1.mmFinancialInstrumentIdentification, SecuritiesReturnCriteria1.mmISOSecurityLongName, SecuritiesReturnCriteria1.mmISOSecurityShortName,
						SecuritiesReturnCriteria1.mmClassificationFinancialInstrument, SecuritiesReturnCriteria1.mmMaturityDate, SecuritiesReturnCriteria1.mmIssueDate, SecuritiesReturnCriteria1.mmIssueCurrency,
						SecuritiesReturnCriteria1.mmCountryOfIssue, SecuritiesReturnCriteria1.mmSecurityStatus, SecuritiesReturnCriteria1.mmInvestorCSD, SecuritiesReturnCriteria1.mmIssuerCSD, SecuritiesReturnCriteria1.mmTechnicalIssuerCSD,
						SecuritiesReturnCriteria1.mmCSD, SecuritiesReturnCriteria1.mmSecuritiesQuantityType, SecuritiesReturnCriteria1.mmMinimumDenomination, SecuritiesReturnCriteria1.mmMinimumMultipleQuantity,
						SecuritiesReturnCriteria1.mmDeviatingSettlementUnit);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesReturnCriteria1";
				definition = "Return criteria for information to be returned in the report deriving from a query about securities reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public RequestedIndicator getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(RequestedIndicator financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "ISOSctyLngNm", required = true)
	public RequestedIndicator getISOSecurityLongName() {
		return iSOSecurityLongName;
	}

	public void setISOSecurityLongName(RequestedIndicator iSOSecurityLongName) {
		this.iSOSecurityLongName = iSOSecurityLongName;
	}

	@XmlElement(name = "ISOSctyShrtNm", required = true)
	public RequestedIndicator getISOSecurityShortName() {
		return iSOSecurityShortName;
	}

	public void setISOSecurityShortName(RequestedIndicator iSOSecurityShortName) {
		this.iSOSecurityShortName = iSOSecurityShortName;
	}

	@XmlElement(name = "ClssfctnFinInstrm", required = true)
	public RequestedIndicator getClassificationFinancialInstrument() {
		return classificationFinancialInstrument;
	}

	public void setClassificationFinancialInstrument(RequestedIndicator classificationFinancialInstrument) {
		this.classificationFinancialInstrument = classificationFinancialInstrument;
	}

	@XmlElement(name = "MtrtyDt", required = true)
	public RequestedIndicator getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(RequestedIndicator maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "IsseDt", required = true)
	public RequestedIndicator getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(RequestedIndicator issueDate) {
		this.issueDate = issueDate;
	}

	@XmlElement(name = "IsseCcy", required = true)
	public RequestedIndicator getIssueCurrency() {
		return issueCurrency;
	}

	public void setIssueCurrency(RequestedIndicator issueCurrency) {
		this.issueCurrency = issueCurrency;
	}

	@XmlElement(name = "CtryOfIsse", required = true)
	public RequestedIndicator getCountryOfIssue() {
		return countryOfIssue;
	}

	public void setCountryOfIssue(RequestedIndicator countryOfIssue) {
		this.countryOfIssue = countryOfIssue;
	}

	@XmlElement(name = "SctySts", required = true)
	public RequestedIndicator getSecurityStatus() {
		return securityStatus;
	}

	public void setSecurityStatus(RequestedIndicator securityStatus) {
		this.securityStatus = securityStatus;
	}

	@XmlElement(name = "InvstrCSD", required = true)
	public RequestedIndicator getInvestorCSD() {
		return investorCSD;
	}

	public void setInvestorCSD(RequestedIndicator investorCSD) {
		this.investorCSD = investorCSD;
	}

	@XmlElement(name = "IssrCSD", required = true)
	public RequestedIndicator getIssuerCSD() {
		return issuerCSD;
	}

	public void setIssuerCSD(RequestedIndicator issuerCSD) {
		this.issuerCSD = issuerCSD;
	}

	@XmlElement(name = "TechIssrCSD", required = true)
	public RequestedIndicator getTechnicalIssuerCSD() {
		return technicalIssuerCSD;
	}

	public void setTechnicalIssuerCSD(RequestedIndicator technicalIssuerCSD) {
		this.technicalIssuerCSD = technicalIssuerCSD;
	}

	@XmlElement(name = "CSD", required = true)
	public RequestedIndicator getCSD() {
		return cSD;
	}

	public void setCSD(RequestedIndicator cSD) {
		this.cSD = cSD;
	}

	@XmlElement(name = "SctiesQtyTp", required = true)
	public RequestedIndicator getSecuritiesQuantityType() {
		return securitiesQuantityType;
	}

	public void setSecuritiesQuantityType(RequestedIndicator securitiesQuantityType) {
		this.securitiesQuantityType = securitiesQuantityType;
	}

	@XmlElement(name = "MinDnmtn", required = true)
	public RequestedIndicator getMinimumDenomination() {
		return minimumDenomination;
	}

	public void setMinimumDenomination(RequestedIndicator minimumDenomination) {
		this.minimumDenomination = minimumDenomination;
	}

	@XmlElement(name = "MinMltplQty", required = true)
	public RequestedIndicator getMinimumMultipleQuantity() {
		return minimumMultipleQuantity;
	}

	public void setMinimumMultipleQuantity(RequestedIndicator minimumMultipleQuantity) {
		this.minimumMultipleQuantity = minimumMultipleQuantity;
	}

	@XmlElement(name = "DevtgSttlmUnit", required = true)
	public RequestedIndicator getDeviatingSettlementUnit() {
		return deviatingSettlementUnit;
	}

	public void setDeviatingSettlementUnit(RequestedIndicator deviatingSettlementUnit) {
		this.deviatingSettlementUnit = deviatingSettlementUnit;
	}
}