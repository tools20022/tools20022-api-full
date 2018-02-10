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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, eg, a (old) plan manager, sends the
 * PEPOrISAOrPortfolioInformation message to the instructing party, eg, a (new)
 * plan manager, to provide information about financial instruments held on
 * behalf of a client.<br>
 * <b>Usage</b><br>
 * The PEPOrISAOrPortfolioInformation message is used to provide information
 * about one or more PEP or ISA or portfolio products held in a client's
 * account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmMessageReference
 * PEPOrISAOrPortfolioInformationV01.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPoolReference
 * PEPOrISAOrPortfolioInformationV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPreviousReference
 * PEPOrISAOrPortfolioInformationV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmRelatedReference
 * PEPOrISAOrPortfolioInformationV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPrimaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmSecondaryIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmOtherIndividualInvestor
 * PEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmPrimaryCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmSecondaryCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmOtherCorporateInvestor
 * PEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmClientAccount
 * PEPOrISAOrPortfolioInformationV01.mmClientAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmNomineeAccount
 * PEPOrISAOrPortfolioInformationV01.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmNewPlanManager
 * PEPOrISAOrPortfolioInformationV01.mmNewPlanManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmProductTransfer
 * PEPOrISAOrPortfolioInformationV01.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01#mmExtension
 * PEPOrISAOrPortfolioInformationV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PEPOrISAOrPrtflInfV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.018.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPEPISARule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintPEPISARule.forPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPorfolioRule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintPorfolioRule.forPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestorRule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintInvestorRule.forPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCorporateRule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintCorporateRule.forPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDesignationRule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintDesignationRule.forPEPOrISAOrPortfolioInformationV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule#forPEPOrISAOrPortfolioInformationV01
 * ConstraintNomineeAccountServicerRule.forPEPOrISAOrPortfolioInformationV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPOrISAOrPortfolioInformationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, eg, a (old) plan manager, sends the PEPOrISAOrPortfolioInformation message to the instructing party, eg, a (new) plan manager, to provide information about financial instruments held on behalf of a client.\r\nUsage\r\nThe PEPOrISAOrPortfolioInformation message is used to provide information about one or more PEP or ISA or portfolio products held in a client's account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV02
 * AccountHoldingInformationV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PEPOrISAOrPortfolioInformationV01", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "primaryIndividualInvestor", "secondaryIndividualInvestor", "otherIndividualInvestor",
		"primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "clientAccount", "nomineeAccount", "newPlanManager", "productTransfer", "extension"})
public class PEPOrISAOrPortfolioInformationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgRef", required = true)
	protected MessageIdentification1 messageReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getMessageReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmryIndvInvstr")
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPrimaryIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getPrimaryIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ScndryIndvInvstr")
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecondaryIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, eg, name, address, social security number and date of birth.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getSecondaryIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrIndvInvstr")
	protected List<IndividualPerson8> otherIndividualInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson8
	 * IndividualPerson8}</li>
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
	 * "Information identifying other individual investors, eg, name, address, social security number and date of birth."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying other individual investors, eg, name, address, social security number and date of birth.";
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getOtherIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmryCorpInvstr")
	protected Organisation4 primaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPrimaryCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getPrimaryCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ScndryCorpInvstr")
	protected Organisation4 secondaryCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecondaryCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, eg, name and address.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getSecondaryCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrCorpInvstr")
	protected List<Organisation4> otherCorporateInvestor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation4
	 * Organisation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, eg, name and address.";
			minOccurs = 0;
			complexType_lazy = () -> Organisation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getOtherCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ClntAcct", required = true)
	protected Account5 clientAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account5
	 * Account5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an account owned by the investor at the old plan manager (account servicer)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClientAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClntAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getClientAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NmneeAcct")
	protected Account6 nomineeAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account6
	 * Account6}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNomineeAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getNomineeAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NewPlanMgr", required = true)
	protected PartyIdentification2Choice newPlanManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPlanMgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPlanManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the institution to which the financial instrument is to be transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewPlanManager = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewPlanMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPlanManager";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getNewPlanManager", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PdctTrf", required = true)
	protected List<PEPISATransfer6> productTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PEPISATransfer6
	 * PEPISATransfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information related to the asset(s) transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProductTransfer = new MMMessageBuildingBlock() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			minOccurs = 1;
			complexType_lazy = () -> PEPISATransfer6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getProductTransfer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PEPOrISAOrPortfolioInformationV01.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPEPISARule.forPEPOrISAOrPortfolioInformationV01,
						com.tools20022.repository.constraints.ConstraintPorfolioRule.forPEPOrISAOrPortfolioInformationV01, com.tools20022.repository.constraints.ConstraintInvestorRule.forPEPOrISAOrPortfolioInformationV01,
						com.tools20022.repository.constraints.ConstraintCorporateRule.forPEPOrISAOrPortfolioInformationV01, com.tools20022.repository.constraints.ConstraintDesignationRule.forPEPOrISAOrPortfolioInformationV01,
						com.tools20022.repository.constraints.ConstraintNomineeAccountServicerRule.forPEPOrISAOrPortfolioInformationV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PEPOrISAOrPortfolioInformationV01";
				definition = "Scope\r\nAn executing party, eg, a (old) plan manager, sends the PEPOrISAOrPortfolioInformation message to the instructing party, eg, a (new) plan manager, to provide information about financial instruments held on behalf of a client.\r\nUsage\r\nThe PEPOrISAOrPortfolioInformation message is used to provide information about one or more PEP or ISA or portfolio products held in a client's account.";
				nextVersions_lazy = () -> Arrays.asList(AccountHoldingInformationV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PEPOrISAOrPrtflInfV01";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmMessageReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPoolReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPreviousReference,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmRelatedReference, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmClientAccount,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmNomineeAccount, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmNewPlanManager,
						com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmProductTransfer, com.tools20022.repository.area.sese.PEPOrISAOrPortfolioInformationV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "018";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PEPOrISAOrPortfolioInformationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public PEPOrISAOrPortfolioInformationV01 setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = Objects.requireNonNull(messageReference);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public PEPOrISAOrPortfolioInformationV01 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public PEPOrISAOrPortfolioInformationV01 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PEPOrISAOrPortfolioInformationV01 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<IndividualPerson8> getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor == null ? Optional.empty() : Optional.of(primaryIndividualInvestor);
	}

	public PEPOrISAOrPortfolioInformationV01 setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
		return this;
	}

	public Optional<IndividualPerson8> getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor == null ? Optional.empty() : Optional.of(secondaryIndividualInvestor);
	}

	public PEPOrISAOrPortfolioInformationV01 setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
		return this;
	}

	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor == null ? otherIndividualInvestor = new ArrayList<>() : otherIndividualInvestor;
	}

	public PEPOrISAOrPortfolioInformationV01 setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = Objects.requireNonNull(otherIndividualInvestor);
		return this;
	}

	public Optional<Organisation4> getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor == null ? Optional.empty() : Optional.of(primaryCorporateInvestor);
	}

	public PEPOrISAOrPortfolioInformationV01 setPrimaryCorporateInvestor(Organisation4 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
		return this;
	}

	public Optional<Organisation4> getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor == null ? Optional.empty() : Optional.of(secondaryCorporateInvestor);
	}

	public PEPOrISAOrPortfolioInformationV01 setSecondaryCorporateInvestor(Organisation4 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
		return this;
	}

	public List<Organisation4> getOtherCorporateInvestor() {
		return otherCorporateInvestor == null ? otherCorporateInvestor = new ArrayList<>() : otherCorporateInvestor;
	}

	public PEPOrISAOrPortfolioInformationV01 setOtherCorporateInvestor(List<Organisation4> otherCorporateInvestor) {
		this.otherCorporateInvestor = Objects.requireNonNull(otherCorporateInvestor);
		return this;
	}

	public Account5 getClientAccount() {
		return clientAccount;
	}

	public PEPOrISAOrPortfolioInformationV01 setClientAccount(Account5 clientAccount) {
		this.clientAccount = Objects.requireNonNull(clientAccount);
		return this;
	}

	public Optional<Account6> getNomineeAccount() {
		return nomineeAccount == null ? Optional.empty() : Optional.of(nomineeAccount);
	}

	public PEPOrISAOrPortfolioInformationV01 setNomineeAccount(Account6 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
		return this;
	}

	public PartyIdentification2Choice getNewPlanManager() {
		return newPlanManager;
	}

	public PEPOrISAOrPortfolioInformationV01 setNewPlanManager(PartyIdentification2Choice newPlanManager) {
		this.newPlanManager = Objects.requireNonNull(newPlanManager);
		return this;
	}

	public List<PEPISATransfer6> getProductTransfer() {
		return productTransfer == null ? productTransfer = new ArrayList<>() : productTransfer;
	}

	public PEPOrISAOrPortfolioInformationV01 setProductTransfer(List<PEPISATransfer6> productTransfer) {
		this.productTransfer = Objects.requireNonNull(productTransfer);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PEPOrISAOrPortfolioInformationV01 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.018.001.01")
	static public class Document {
		@XmlElement(name = "PEPOrISAOrPrtflInfV01", required = true)
		public PEPOrISAOrPortfolioInformationV01 messageBody;
	}
}