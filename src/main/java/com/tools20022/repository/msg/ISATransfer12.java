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
import com.tools20022.repository.choice.PartyIdentification2Choice;
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
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmPrimaryIndividualInvestor
 * ISATransfer12.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmSecondaryIndividualInvestor
 * ISATransfer12.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmOtherIndividualInvestor
 * ISATransfer12.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmPrimaryCorporateInvestor
 * ISATransfer12.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmSecondaryCorporateInvestor
 * ISATransfer12.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmOtherCorporateInvestor
 * ISATransfer12.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmTransferorAccount
 * ISATransfer12.mmTransferorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12#mmNomineeAccount
 * ISATransfer12.mmNomineeAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12#mmTransferee
 * ISATransfer12.mmTransferee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12#mmCashAccount
 * ISATransfer12.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmProductTransferAndReference
 * ISATransfer12.mmProductTransferAndReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12#mmExtension
 * ISATransfer12.mmExtension}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintISARule#forISATransfer12
 * ConstraintISARule.forISATransfer12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forISATransfer12
 * ConstraintPorfolioRule.forISATransfer12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forISATransfer12
 * ConstraintInvestorRule.forISATransfer12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forISATransfer12
 * ConstraintCorporateRule.forISATransfer12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forISATransfer12
 * ConstraintDesignationRule.forISATransfer12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#forISATransfer12
 * ConstraintNomineeAccountServicerRule.forISATransfer12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATransfer12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer9
 * ISATransfer9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer12", propOrder = {"primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor", "primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount",
		"nomineeAccount", "transferee", "cashAccount", "productTransferAndReference", "extension"})
public class ISATransfer12 {

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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the primary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryIndividualInvestor
	 * ISATransfer19.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmPrimaryIndividualInvestor
	 * ISATransfer9.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, eg, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmPrimaryIndividualInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmPrimaryIndividualInvestor;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryIndividualInvestor
	 * ISATransfer19.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmSecondaryIndividualInvestor
	 * ISATransfer9.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmSecondaryIndividualInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmSecondaryIndividualInvestor;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the other individual investors, eg, name, address, social security number and date of birth."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherIndividualInvestor
	 * ISATransfer19.mmOtherIndividualInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmOtherIndividualInvestor
	 * ISATransfer9.mmOtherIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIndividualInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying the other individual investors, eg, name, address, social security number and date of birth.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmOtherIndividualInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmOtherIndividualInvestor;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson8.mmObject();
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation4 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the primary corporate investor, eg, name and address."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmPrimaryCorporateInvestor
	 * ISATransfer19.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmPrimaryCorporateInvestor
	 * ISATransfer9.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, eg, name and address.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmPrimaryCorporateInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmPrimaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation4.mmObject();
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation4 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the secondary corporate investor, eg, name and address."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmSecondaryCorporateInvestor
	 * ISATransfer19.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmSecondaryCorporateInvestor
	 * ISATransfer9.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, eg, name and address.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmSecondaryCorporateInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmSecondaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation4.mmObject();
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<com.tools20022.repository.msg.Organisation4> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * "Information identifying the other corporate investors, eg, name and address."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmOtherCorporateInvestor
	 * ISATransfer19.mmOtherCorporateInvestor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmOtherCorporateInvestor
	 * ISATransfer9.mmOtherCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCorporateInvestor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, eg, name and address.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmOtherCorporateInvestor);
			previousVersion_lazy = () -> ISATransfer9.mmOtherCorporateInvestor;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation4.mmObject();
		}
	};
	@XmlElement(name = "TrfrAcct", required = true)
	protected Account15 transferorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account15 Account15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
	 * PortfolioTransfer.mmAccountFrom}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferorAccount
	 * ISATransfer19.mmTransferorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmTransferorAccount
	 * ISATransfer9.mmTransferorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmAccountFrom;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmTransferorAccount);
			previousVersion_lazy = () -> ISATransfer9.mmTransferorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account15.mmObject();
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account16 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Account16 Account16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
	 * PortfolioTransfer.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmNomineeAccount
	 * ISATransfer19.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmNomineeAccount
	 * ISATransfer9.mmNomineeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNomineeAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmNomineeAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmNomineeAccount);
			previousVersion_lazy = () -> ISATransfer9.mmNomineeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Account16.mmObject();
		}
	};
	@XmlElement(name = "Trfee", required = true)
	protected PartyIdentification2Choice transferee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferee
	 * ISATransfer19.mmTransferee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmTransferee
	 * ISATransfer9.mmTransferee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferee = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmTransferee);
			previousVersion_lazy = () -> ISATransfer9.mmTransferee;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccount29 cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount29
	 * CashAccount29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCashAccount
	 * InvestmentAccount.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmCashAccount
	 * ISATransfer19.mmCashAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmCashAccount
	 * ISATransfer9.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Identification of an account owned by the investor to which a cash entry is made based on the transfer of asset(s).";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmCashAccount);
			previousVersion_lazy = () -> ISATransfer9.mmCashAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount29.mmObject();
		}
	};
	@XmlElement(name = "PdctTrfAndRef", required = true)
	protected ISATransfer17 productTransferAndReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISATransfer17
	 * ISATransfer17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmProductTransferAndReference
	 * ISATransfer19.mmProductTransferAndReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductTransferAndReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "PdctTrfAndRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransferAndReference";
			definition = "Details of the transfer to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmProductTransferAndReference);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ISATransfer17.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19#mmExtension
	 * ISATransfer19.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmExtension
	 * ISATransfer9.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer12.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmExtension);
			previousVersion_lazy = () -> ISATransfer9.mmExtension;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer12.mmPrimaryIndividualInvestor, com.tools20022.repository.msg.ISATransfer12.mmSecondaryIndividualInvestor,
						com.tools20022.repository.msg.ISATransfer12.mmOtherIndividualInvestor, com.tools20022.repository.msg.ISATransfer12.mmPrimaryCorporateInvestor,
						com.tools20022.repository.msg.ISATransfer12.mmSecondaryCorporateInvestor, com.tools20022.repository.msg.ISATransfer12.mmOtherCorporateInvestor, com.tools20022.repository.msg.ISATransfer12.mmTransferorAccount,
						com.tools20022.repository.msg.ISATransfer12.mmNomineeAccount, com.tools20022.repository.msg.ISATransfer12.mmTransferee, com.tools20022.repository.msg.ISATransfer12.mmCashAccount,
						com.tools20022.repository.msg.ISATransfer12.mmProductTransferAndReference, com.tools20022.repository.msg.ISATransfer12.mmExtension);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintISARule.forISATransfer12, com.tools20022.repository.constraints.ConstraintPorfolioRule.forISATransfer12,
						com.tools20022.repository.constraints.ConstraintInvestorRule.forISATransfer12, com.tools20022.repository.constraints.ConstraintCorporateRule.forISATransfer12,
						com.tools20022.repository.constraints.ConstraintDesignationRule.forISATransfer12, com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.forISATransfer12);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer12";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer19.mmObject());
				previousVersion_lazy = () -> ISATransfer9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public ISATransfer12 setPrimaryIndividualInvestor(com.tools20022.repository.msg.IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public ISATransfer12 setSecondaryIndividualInvestor(com.tools20022.repository.msg.IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public ISATransfer12 setOtherIndividualInvestor(List<com.tools20022.repository.msg.IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public ISATransfer12 setPrimaryCorporateInvestor(com.tools20022.repository.msg.Organisation4 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public ISATransfer12 setSecondaryCorporateInvestor(com.tools20022.repository.msg.Organisation4 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation4> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public ISATransfer12 setOtherCorporateInvestor(List<com.tools20022.repository.msg.Organisation4> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account15 getTransferorAccount() {
		return transferorAccount;
	}

	public ISATransfer12 setTransferorAccount(com.tools20022.repository.msg.Account15 transferorAccount) {
		this.transferorAccount = Objects.requireNonNull(transferorAccount);
		return this;
	}

	public Optional<Account16> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public ISATransfer12 setNomineeAccount(com.tools20022.repository.msg.Account16 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification2Choice getTransferee() {
		return transferee;
	}

	public ISATransfer12 setTransferee(PartyIdentification2Choice transferee) {
		this.transferee = Objects.requireNonNull(transferee);
		return this;
	}

	public Optional<CashAccount29> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public ISATransfer12 setCashAccount(com.tools20022.repository.msg.CashAccount29 cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public ISATransfer17 getProductTransferAndReference() {
		return productTransferAndReference;
	}

	public ISATransfer12 setProductTransferAndReference(com.tools20022.repository.msg.ISATransfer17 productTransferAndReference) {
		this.productTransferAndReference = Objects.requireNonNull(productTransferAndReference);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public ISATransfer12 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}