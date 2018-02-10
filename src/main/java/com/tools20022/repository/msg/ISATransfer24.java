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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmPrimaryIndividualInvestor
 * ISATransfer24.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmSecondaryIndividualInvestor
 * ISATransfer24.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmOtherIndividualInvestor
 * ISATransfer24.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmPrimaryCorporateInvestor
 * ISATransfer24.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmSecondaryCorporateInvestor
 * ISATransfer24.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmOtherCorporateInvestor
 * ISATransfer24.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmTransferorAccount
 * ISATransfer24.mmTransferorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#mmNomineeAccount
 * ISATransfer24.mmNomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#mmTransferee
 * ISATransfer24.mmTransferee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmIntermediaryInformation
 * ISATransfer24.mmIntermediaryInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#mmCashAccount
 * ISATransfer24.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmProductTransferAndReference
 * ISATransfer24.mmProductTransferAndReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24#mmExtension
 * ISATransfer24.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer24
 * ConstraintISARule.forISATransfer24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPortfolioRule#forISATransfer24
 * ConstraintPortfolioRule.forISATransfer24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer24
 * ConstraintInvestorRule.forISATransfer24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer24
 * ConstraintCorporateRule.forISATransfer24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer24
 * ConstraintDesignationRule.forISATransfer24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#forISATransfer24
 * ConstraintNomineeAccountServicerRule.forISATransfer24}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATransfer24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer19
 * ISATransfer19}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer24", propOrder = {"primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor", "primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount",
		"nomineeAccount", "transferee", "intermediaryInformation", "cashAccount", "productTransferAndReference", "extension"})
public class ISATransfer24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmryIndvInvstr")
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryIndvInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryIndividualInvestor
	 * ISATransfer19.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> ISATransfer19.mmPrimaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
		}
	};
	@XmlElement(name = "ScndryIndvInvstr")
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryIndvInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryIndividualInvestor
	 * ISATransfer19.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> ISATransfer19.mmSecondaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
		}
	};
	@XmlElement(name = "OthrIndvInvstr")
	protected List<com.tools20022.repository.msg.IndividualPerson8> otherIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrIndvInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIndividualInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other individual investors, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherIndividualInvestor
	 * ISATransfer19.mmOtherIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying the other individual investors, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> ISATransfer19.mmOtherIndividualInvestor;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation21 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryCorpInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the primary corporate investor, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryCorporateInvestor
	 * ISATransfer19.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, for example, name and address.";
			previousVersion_lazy = () -> ISATransfer19.mmPrimaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation21.mmObject();
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation21 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryCorpInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the secondary corporate investor, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryCorporateInvestor
	 * ISATransfer19.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, for example, name and address.";
			previousVersion_lazy = () -> ISATransfer19.mmSecondaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation21.mmObject();
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<com.tools20022.repository.msg.Organisation21> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCorpInvstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCorporateInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information identifying the other corporate investors, for example, name and address."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherCorporateInvestor
	 * ISATransfer19.mmOtherCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, for example, name and address.";
			previousVersion_lazy = () -> ISATransfer19.mmOtherCorporateInvestor;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation21.mmObject();
		}
	};
	@XmlElement(name = "TrfrAcct", required = true)
	protected Account19 transferorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account19 Account19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
	 * PortfolioTransfer.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor at the old plan manager (account servicer)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferorAccount
	 * ISATransfer19.mmTransferorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmAccountFrom;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			previousVersion_lazy = () -> ISATransfer19.mmTransferorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account19.mmObject();
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account19 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account19 Account19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
	 * PortfolioTransfer.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmneeAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmNomineeAccount
	 * ISATransfer19.mmNomineeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNomineeAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmNomineeAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			previousVersion_lazy = () -> ISATransfer19.mmNomineeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account19.mmObject();
		}
	};
	@XmlElement(name = "Trfee", required = true)
	protected PartyIdentification70Choice transferee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trfee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transferee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the institution to which the financial instrument is to be transferred."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferee
	 * ISATransfer19.mmTransferee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			previousVersion_lazy = () -> ISATransfer19.mmTransferee;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<com.tools20022.repository.msg.Intermediary34> intermediaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary34
	 * Intermediary34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related party or intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Identification of a related party or intermediary.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary34.mmObject();
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount34 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount34
	 * CashAccount34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmCashAccount
	 * ISATransfer19.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s).";
			previousVersion_lazy = () -> ISATransfer19.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount34.mmObject();
		}
	};
	@XmlElement(name = "PdctTrfAndRef", required = true)
	protected ISATransfer25 productTransferAndReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISATransfer25
	 * ISATransfer25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTrfAndRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductTransferAndReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmProductTransferAndReference
	 * ISATransfer19.mmProductTransferAndReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductTransferAndReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "PdctTrfAndRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransferAndReference";
			definition = "Details of the transfer to be cancelled.";
			previousVersion_lazy = () -> ISATransfer19.mmProductTransferAndReference;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ISATransfer25.mmObject();
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmExtension
	 * ISATransfer19.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer24.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> ISATransfer19.mmExtension;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer24.mmPrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer24.mmSecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer24.mmOtherIndividualInvestor, com.tools20022.repository.msg.ISATransfer24.mmPrimaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer24.mmSecondaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer24.mmOtherCorporateInvestor, com.tools20022.repository.msg.ISATransfer24.mmTransferorAccount,
						com.tools20022.repository.msg.ISATransfer24.mmNomineeAccount, com.tools20022.repository.msg.ISATransfer24.mmTransferee, com.tools20022.repository.msg.ISATransfer24.mmIntermediaryInformation,
						com.tools20022.repository.msg.ISATransfer24.mmCashAccount, com.tools20022.repository.msg.ISATransfer24.mmProductTransferAndReference, com.tools20022.repository.msg.ISATransfer24.mmExtension);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forISATransfer24, com.tools20022.repository.constraints.ConstraintPortfolioRule.forISATransfer24,
						com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer24, com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer24,
						com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer24, com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.forISATransfer24);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer24";
				definition = "Describes the type of product and the assets to be transferred.";
				previousVersion_lazy = () -> ISATransfer19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public ISATransfer24 setPrimaryIndividualInvestor(com.tools20022.repository.msg.IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public ISATransfer24 setSecondaryIndividualInvestor(com.tools20022.repository.msg.IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public ISATransfer24 setOtherIndividualInvestor(List<com.tools20022.repository.msg.IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation21> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public ISATransfer24 setPrimaryCorporateInvestor(com.tools20022.repository.msg.Organisation21 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation21> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public ISATransfer24 setSecondaryCorporateInvestor(com.tools20022.repository.msg.Organisation21 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation21> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public ISATransfer24 setOtherCorporateInvestor(List<com.tools20022.repository.msg.Organisation21> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account19 getTransferorAccount() {
		return transferorAccount;
	}

	public ISATransfer24 setTransferorAccount(com.tools20022.repository.msg.Account19 transferorAccount) {
		this.transferorAccount = Objects.requireNonNull(transferorAccount);
		return this;
	}

	public Optional<Account19> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public ISATransfer24 setNomineeAccount(com.tools20022.repository.msg.Account19 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification70Choice getTransferee() {
		return transferee;
	}

	public ISATransfer24 setTransferee(PartyIdentification70Choice transferee) {
		this.transferee = Objects.requireNonNull(transferee);
		return this;
	}

	public List<Intermediary34> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public ISATransfer24 setIntermediaryInformation(List<com.tools20022.repository.msg.Intermediary34> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public Optional<CashAccount34> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public ISATransfer24 setCashAccount(com.tools20022.repository.msg.CashAccount34 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public ISATransfer25 getProductTransferAndReference() {
		return productTransferAndReference;
	}

	public ISATransfer24 setProductTransferAndReference(com.tools20022.repository.msg.ISATransfer25 productTransferAndReference) {
		this.productTransferAndReference = Objects.requireNonNull(productTransferAndReference);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public ISATransfer24 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}