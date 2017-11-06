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
import com.tools20022.repository.codeset.AssuredType1Code;
import com.tools20022.repository.codeset.InsuranceClauses1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.InsuranceCertificate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the details relative to the submission of the insurance data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmSubmitter
 * RequiredSubmission3.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchIssuer
 * RequiredSubmission3.mmMatchIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchIssueDate
 * RequiredSubmission3.mmMatchIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchTransport
 * RequiredSubmission3.mmMatchTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchAmount
 * RequiredSubmission3.mmMatchAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmClausesRequired
 * RequiredSubmission3.mmClausesRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3#mmMatchAssuredParty
 * RequiredSubmission3.mmMatchAssuredParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InsuranceCertificate
 * InsuranceCertificate}</li>
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
 * "RequiredSubmission3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details relative to the submission of the insurance data set."
 * </li>
 * </ul>
 */
public class RequiredSubmission3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.BICIdentification1> submitter;
	/**
	 * Specifies with party(ies) is authorised to submit the data set as part of
	 * the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies with party(ies) is authorised to submit the data set as part of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "Submitr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "Specifies with party(ies) is authorised to submit the data set as part of the transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};
	protected PartyIdentification27 matchIssuer;
	/**
	 * Specifies if the issuer must be matched as part of the validation of the
	 * data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification27
	 * PartyIdentification27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMatchIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssuer";
			definition = "Specifies if the issuer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification27.mmObject();
		}
	};
	protected YesNoIndicator matchIssueDate;
	/**
	 * Specifies if the issue date must be matched as part of the validation of
	 * the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issue date must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchIssueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchIsseDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssueDate";
			definition = "Specifies if the issue date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator matchTransport;
	/**
	 * Specifies if the transport information must be matched as part of the
	 * validation of the data set.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the transport information must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchTransport = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.mmTransport;
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchTrnsprt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchTransport";
			definition = "Specifies if the transport information must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator matchAmount;
	/**
	 * Specifies if the insured amount must be matched as part of the validation
	 * of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the insured amount must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchAmount";
			definition = "Specifies if the insured amount must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<InsuranceClauses1Code> clausesRequired;
	/**
	 * Specifies which clauses are required in the insurance data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InsuranceClauses1Code
	 * InsuranceClauses1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmInsuranceClauses
	 * InsuranceCertificate.mmInsuranceClauses}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClausesReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClausesRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which clauses are required in the insurance data set."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClausesRequired = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmInsuranceClauses;
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "ClausesReqrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClausesRequired";
			definition = "Specifies which clauses are required in the insurance data set.";
			minOccurs = 0;
			simpleType_lazy = () -> InsuranceClauses1Code.mmObject();
		}
	};
	protected AssuredType1Code matchAssuredParty;
	/**
	 * Specifies if the assured (insured) party must be matched as part of the
	 * validation of the data set.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssuredType1Code
	 * AssuredType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchAssrdPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchAssuredParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the assured (insured) party must be matched as part of the validation of the data set."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchAssuredParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchAssrdPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchAssuredParty";
			definition = "Specifies if the assured (insured) party must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssuredType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission3.mmSubmitter, com.tools20022.repository.msg.RequiredSubmission3.mmMatchIssuer,
						com.tools20022.repository.msg.RequiredSubmission3.mmMatchIssueDate, com.tools20022.repository.msg.RequiredSubmission3.mmMatchTransport, com.tools20022.repository.msg.RequiredSubmission3.mmMatchAmount,
						com.tools20022.repository.msg.RequiredSubmission3.mmClausesRequired, com.tools20022.repository.msg.RequiredSubmission3.mmMatchAssuredParty);
				trace_lazy = () -> InsuranceCertificate.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RequiredSubmission3";
				definition = "Specifies the details relative to the submission of the insurance data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<BICIdentification1> getSubmitter() {
		return submitter;
	}

	public void setSubmitter(List<com.tools20022.repository.msg.BICIdentification1> submitter) {
		this.submitter = submitter;
	}

	public PartyIdentification27 getMatchIssuer() {
		return matchIssuer;
	}

	public void setMatchIssuer(com.tools20022.repository.msg.PartyIdentification27 matchIssuer) {
		this.matchIssuer = matchIssuer;
	}

	public YesNoIndicator getMatchIssueDate() {
		return matchIssueDate;
	}

	public void setMatchIssueDate(YesNoIndicator matchIssueDate) {
		this.matchIssueDate = matchIssueDate;
	}

	public YesNoIndicator getMatchTransport() {
		return matchTransport;
	}

	public void setMatchTransport(YesNoIndicator matchTransport) {
		this.matchTransport = matchTransport;
	}

	public YesNoIndicator getMatchAmount() {
		return matchAmount;
	}

	public void setMatchAmount(YesNoIndicator matchAmount) {
		this.matchAmount = matchAmount;
	}

	public List<InsuranceClauses1Code> getClausesRequired() {
		return clausesRequired;
	}

	public void setClausesRequired(List<InsuranceClauses1Code> clausesRequired) {
		this.clausesRequired = clausesRequired;
	}

	public AssuredType1Code getMatchAssuredParty() {
		return matchAssuredParty;
	}

	public void setMatchAssuredParty(AssuredType1Code matchAssuredParty) {
		this.matchAssuredParty = matchAssuredParty;
	}
}