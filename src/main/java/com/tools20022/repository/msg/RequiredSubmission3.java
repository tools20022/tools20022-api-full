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
import com.tools20022.repository.codeset.AssuredType1Code;
import com.tools20022.repository.codeset.InsuranceClauses1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.FinancialInstitution;
import com.tools20022.repository.entity.InsuranceCertificate;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BICIdentification1;
import com.tools20022.repository.msg.PartyIdentification27;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequiredSubmission3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details relative to the submission of the insurance data set."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequiredSubmission3", propOrder = {"submitter", "matchIssuer", "matchIssueDate", "matchTransport", "matchAmount", "clausesRequired", "matchAssuredParty"})
public class RequiredSubmission3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Submitr", required = true)
	protected List<BICIdentification1> submitter;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies with party(ies) is authorised to submit the data set as part of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequiredSubmission3, List<BICIdentification1>> mmSubmitter = new MMMessageAssociationEnd<RequiredSubmission3, List<BICIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "Specifies with party(ies) is authorised to submit the data set as part of the transaction.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public List<BICIdentification1> getValue(RequiredSubmission3 obj) {
			return obj.getSubmitter();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, List<BICIdentification1> value) {
			obj.setSubmitter(value);
		}
	};
	@XmlElement(name = "MtchIssr")
	protected PartyIdentification27 matchIssuer;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issuer must be matched as part of the validation of the data set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RequiredSubmission3, Optional<PartyIdentification27>> mmMatchIssuer = new MMMessageAssociationEnd<RequiredSubmission3, Optional<PartyIdentification27>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssuer";
			definition = "Specifies if the issuer must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification27.mmObject();
		}

		@Override
		public Optional<PartyIdentification27> getValue(RequiredSubmission3 obj) {
			return obj.getMatchIssuer();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, Optional<PartyIdentification27> value) {
			obj.setMatchIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchIsseDt", required = true)
	protected YesNoIndicator matchIssueDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchIsseDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchIssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the issue date must be matched as part of the validation of the data set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission3, YesNoIndicator> mmMatchIssueDate = new MMMessageAttribute<RequiredSubmission3, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchIsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchIssueDate";
			definition = "Specifies if the issue date must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission3 obj) {
			return obj.getMatchIssueDate();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, YesNoIndicator value) {
			obj.setMatchIssueDate(value);
		}
	};
	@XmlElement(name = "MtchTrnsprt", required = true)
	protected YesNoIndicator matchTransport;
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchTrnsprt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the transport information must be matched as part of the validation of the data set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission3, YesNoIndicator> mmMatchTransport = new MMMessageAttribute<RequiredSubmission3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Document.mmTransport;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchTransport";
			definition = "Specifies if the transport information must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission3 obj) {
			return obj.getMatchTransport();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, YesNoIndicator value) {
			obj.setMatchTransport(value);
		}
	};
	@XmlElement(name = "MtchAmt", required = true)
	protected YesNoIndicator matchAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission3
	 * RequiredSubmission3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the insured amount must be matched as part of the validation of the data set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission3, YesNoIndicator> mmMatchAmount = new MMMessageAttribute<RequiredSubmission3, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchAmount";
			definition = "Specifies if the insured amount must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RequiredSubmission3 obj) {
			return obj.getMatchAmount();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, YesNoIndicator value) {
			obj.setMatchAmount(value);
		}
	};
	@XmlElement(name = "ClausesReqrd")
	protected List<InsuranceClauses1Code> clausesRequired;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClausesRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which clauses are required in the insurance data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission3, List<InsuranceClauses1Code>> mmClausesRequired = new MMMessageAttribute<RequiredSubmission3, List<InsuranceClauses1Code>>() {
		{
			businessElementTrace_lazy = () -> InsuranceCertificate.mmInsuranceClauses;
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "ClausesReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClausesRequired";
			definition = "Specifies which clauses are required in the insurance data set.";
			minOccurs = 0;
			simpleType_lazy = () -> InsuranceClauses1Code.mmObject();
		}

		@Override
		public List<InsuranceClauses1Code> getValue(RequiredSubmission3 obj) {
			return obj.getClausesRequired();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, List<InsuranceClauses1Code> value) {
			obj.setClausesRequired(value);
		}
	};
	@XmlElement(name = "MtchAssrdPty")
	protected AssuredType1Code matchAssuredParty;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchAssuredParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the assured (insured) party must be matched as part of the validation of the data set."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequiredSubmission3, Optional<AssuredType1Code>> mmMatchAssuredParty = new MMMessageAttribute<RequiredSubmission3, Optional<AssuredType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission3.mmObject();
			isDerived = false;
			xmlTag = "MtchAssrdPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchAssuredParty";
			definition = "Specifies if the assured (insured) party must be matched as part of the validation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssuredType1Code.mmObject();
		}

		@Override
		public Optional<AssuredType1Code> getValue(RequiredSubmission3 obj) {
			return obj.getMatchAssuredParty();
		}

		@Override
		public void setValue(RequiredSubmission3 obj, Optional<AssuredType1Code> value) {
			obj.setMatchAssuredParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission3.mmSubmitter, com.tools20022.repository.msg.RequiredSubmission3.mmMatchIssuer,
						com.tools20022.repository.msg.RequiredSubmission3.mmMatchIssueDate, com.tools20022.repository.msg.RequiredSubmission3.mmMatchTransport, com.tools20022.repository.msg.RequiredSubmission3.mmMatchAmount,
						com.tools20022.repository.msg.RequiredSubmission3.mmClausesRequired, com.tools20022.repository.msg.RequiredSubmission3.mmMatchAssuredParty);
				trace_lazy = () -> InsuranceCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequiredSubmission3";
				definition = "Specifies the details relative to the submission of the insurance data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<BICIdentification1> getSubmitter() {
		return submitter == null ? submitter = new ArrayList<>() : submitter;
	}

	public RequiredSubmission3 setSubmitter(List<BICIdentification1> submitter) {
		this.submitter = Objects.requireNonNull(submitter);
		return this;
	}

	public Optional<PartyIdentification27> getMatchIssuer() {
		return matchIssuer == null ? Optional.empty() : Optional.of(matchIssuer);
	}

	public RequiredSubmission3 setMatchIssuer(PartyIdentification27 matchIssuer) {
		this.matchIssuer = matchIssuer;
		return this;
	}

	public YesNoIndicator getMatchIssueDate() {
		return matchIssueDate;
	}

	public RequiredSubmission3 setMatchIssueDate(YesNoIndicator matchIssueDate) {
		this.matchIssueDate = Objects.requireNonNull(matchIssueDate);
		return this;
	}

	public YesNoIndicator getMatchTransport() {
		return matchTransport;
	}

	public RequiredSubmission3 setMatchTransport(YesNoIndicator matchTransport) {
		this.matchTransport = Objects.requireNonNull(matchTransport);
		return this;
	}

	public YesNoIndicator getMatchAmount() {
		return matchAmount;
	}

	public RequiredSubmission3 setMatchAmount(YesNoIndicator matchAmount) {
		this.matchAmount = Objects.requireNonNull(matchAmount);
		return this;
	}

	public List<InsuranceClauses1Code> getClausesRequired() {
		return clausesRequired == null ? clausesRequired = new ArrayList<>() : clausesRequired;
	}

	public RequiredSubmission3 setClausesRequired(List<InsuranceClauses1Code> clausesRequired) {
		this.clausesRequired = Objects.requireNonNull(clausesRequired);
		return this;
	}

	public Optional<AssuredType1Code> getMatchAssuredParty() {
		return matchAssuredParty == null ? Optional.empty() : Optional.of(matchAssuredParty);
	}

	public RequiredSubmission3 setMatchAssuredParty(AssuredType1Code matchAssuredParty) {
		this.matchAssuredParty = matchAssuredParty;
		return this;
	}
}