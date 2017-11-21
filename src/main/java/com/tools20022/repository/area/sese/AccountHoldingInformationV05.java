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
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.BusinessFlowDirectionType1Code;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a (old) plan manager (Transferor), sends the
 * AccountHoldingInformation message to the instructing party, for example, a
 * (new) plan manager (Transferee), to provide information about financial
 * instruments held on behalf of a client.<br>
 * <b>Usage</b><br>
 * The AccountHoldingInformation message is used to provide information about
 * one or more ISA or portfolio products held in a client's account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctHldgInf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmMessageReference
 * AccountHoldingInformationV05.mmMessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPoolReference
 * AccountHoldingInformationV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPreviousReference
 * AccountHoldingInformationV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmRelatedReference
 * AccountHoldingInformationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmBusinessFlowDirectionType
 * AccountHoldingInformationV05.mmBusinessFlowDirectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPrimaryIndividualInvestor
 * AccountHoldingInformationV05.mmPrimaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmSecondaryIndividualInvestor
 * AccountHoldingInformationV05.mmSecondaryIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmOtherIndividualInvestor
 * AccountHoldingInformationV05.mmOtherIndividualInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPrimaryCorporateInvestor
 * AccountHoldingInformationV05.mmPrimaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmSecondaryCorporateInvestor
 * AccountHoldingInformationV05.mmSecondaryCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmOtherCorporateInvestor
 * AccountHoldingInformationV05.mmOtherCorporateInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmTransferorAccount
 * AccountHoldingInformationV05.mmTransferorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmNomineeAccount
 * AccountHoldingInformationV05.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmTransferee
 * AccountHoldingInformationV05.mmTransferee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmProductTransfer
 * AccountHoldingInformationV05.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmMarketPracticeVersion
 * AccountHoldingInformationV05.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmExtension
 * AccountHoldingInformationV05.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.018.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountHoldingInformationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a (old) plan manager (Transferor), sends the AccountHoldingInformation message to the instructing party, for example, a (new) plan manager (Transferee), to provide information about financial instruments held on behalf of a client.\r\nUsage\r\nThe AccountHoldingInformation message is used to provide information about one or more ISA or portfolio products held in a client's account."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04
 * AccountHoldingInformationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountHoldingInformationV05", propOrder = {"messageReference", "poolReference", "previousReference", "relatedReference", "businessFlowDirectionType", "primaryIndividualInvestor", "secondaryIndividualInvestor",
		"otherIndividualInvestor", "primaryCorporateInvestor", "secondaryCorporateInvestor", "otherCorporateInvestor", "transferorAccount", "nomineeAccount", "transferee", "productTransfer", "marketPracticeVersion", "extension"})
public class AccountHoldingInformationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageReference;
	/**
	 * Identifies the message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmMessageReference
	 * AccountHoldingInformationV04.mmMessageReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Identifies the message.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmMessageReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getMessageReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 poolReference;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPoolReference
	 * AccountHoldingInformationV04.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPreviousReference
	 * AccountHoldingInformationV04.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmPreviousReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmRelatedReference
	 * AccountHoldingInformationV04.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BusinessFlowDirectionType1Code businessFlowDirectionType;
	/**
	 * Identifies the business flow direction type (assets to be delivered or
	 * received).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionType1Code
	 * BusinessFlowDirectionType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowDrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowDirectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business flow direction type (assets to be delivered or received)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmBusinessFlowDirectionType
	 * AccountHoldingInformationV04.mmBusinessFlowDirectionType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBusinessFlowDirectionType = new MMMessageBuildingBlock() {
		{
			xmlTag = "BizFlowDrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowDirectionType";
			definition = "Identifies the business flow direction type (assets to be delivered or received).";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmBusinessFlowDirectionType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowDirectionType1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getBusinessFlowDirectionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IndividualPerson8 primaryIndividualInvestor;
	/**
	 * Information identifying the primary individual investor, for example,
	 * name, address, social security number and date of birth.
	 * <p>
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
	 * "Information identifying the primary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPrimaryIndividualInvestor
	 * AccountHoldingInformationV04.mmPrimaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPrimaryIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryIndividualInvestor";
			definition = "Information identifying the primary individual investor, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmPrimaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getPrimaryIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected IndividualPerson8 secondaryIndividualInvestor;
	/**
	 * Information identifying the secondary individual investor, for example,
	 * name, address, social security number and date of birth.
	 * <p>
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
	 * "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmSecondaryIndividualInvestor
	 * AccountHoldingInformationV04.mmSecondaryIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecondaryIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScndryIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryIndividualInvestor";
			definition = "Information identifying the secondary individual investor, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmSecondaryIndividualInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getSecondaryIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<IndividualPerson8> otherIndividualInvestor;
	/**
	 * Information identifying other individual investors, for example, name,
	 * address, social security number and date of birth.
	 * <p>
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
	 * "Information identifying other individual investors, for example, name, address, social security number and date of birth."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmOtherIndividualInvestor
	 * AccountHoldingInformationV04.mmOtherIndividualInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherIndividualInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrIndvInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIndividualInvestor";
			definition = "Information identifying other individual investors, for example, name, address, social security number and date of birth.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmOtherIndividualInvestor;
			minOccurs = 0;
			complexType_lazy = () -> IndividualPerson8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getOtherIndividualInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Organisation21 primaryCorporateInvestor;
	/**
	 * Information identifying the primary corporate investor, for example, name
	 * and address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmPrimaryCorporateInvestor
	 * AccountHoldingInformationV04.mmPrimaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPrimaryCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCorporateInvestor";
			definition = "Information identifying the primary corporate investor, for example, name and address.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmPrimaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getPrimaryCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Organisation21 secondaryCorporateInvestor;
	/**
	 * Information identifying the secondary corporate investor, for example,
	 * name and address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmSecondaryCorporateInvestor
	 * AccountHoldingInformationV04.mmSecondaryCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecondaryCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScndryCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCorporateInvestor";
			definition = "Information identifying the secondary corporate investor, for example, name and address.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmSecondaryCorporateInvestor;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getSecondaryCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Organisation21> otherCorporateInvestor;
	/**
	 * Information identifying the other corporate investors, for example, name
	 * and address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation21
	 * Organisation21}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmOtherCorporateInvestor
	 * AccountHoldingInformationV04.mmOtherCorporateInvestor}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherCorporateInvestor = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrCorpInvstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCorporateInvestor";
			definition = "Information identifying the other corporate investors, for example, name and address.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmOtherCorporateInvestor;
			minOccurs = 0;
			complexType_lazy = () -> Organisation21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getOtherCorporateInvestor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Account19 transferorAccount;
	/**
	 * Identification of an account owned by the investor at the old plan
	 * manager (account servicer).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account19
	 * Account19}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmTransferorAccount
	 * AccountHoldingInformationV04.mmTransferorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferorAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferorAccount";
			definition = "Identification of an account owned by the investor at the old plan manager (account servicer).";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmTransferorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Account19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getTransferorAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Account19 nomineeAccount;
	/**
	 * Account held in the name of a party that is not the name of the
	 * beneficial owner of the shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Account19
	 * Account19}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmNomineeAccount
	 * AccountHoldingInformationV04.mmNomineeAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNomineeAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "NmneeAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmNomineeAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Account19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getNomineeAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification70Choice transferee;
	/**
	 * Information related to the institution to which the financial instrument
	 * is to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmTransferee
	 * AccountHoldingInformationV04.mmTransferee}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferee = new MMMessageBuildingBlock() {
		{
			xmlTag = "Trfee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transferee";
			definition = "Information related to the institution to which the financial instrument is to be transferred.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmTransferee;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getTransferee", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ISATransfer23> productTransfer;
	/**
	 * Provides information related to the asset(s) transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ISATransfer23
	 * ISATransfer23}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmProductTransfer
	 * AccountHoldingInformationV04.mmProductTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProductTransfer = new MMMessageBuildingBlock() {
		{
			xmlTag = "PdctTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductTransfer";
			definition = "Provides information related to the asset(s) transferred.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmProductTransfer;
			minOccurs = 1;
			complexType_lazy = () -> ISATransfer23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getProductTransfer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmMarketPracticeVersion
	 * AccountHoldingInformationV04.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV04#mmExtension
	 * AccountHoldingInformationV04.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			previousVersion_lazy = () -> AccountHoldingInformationV04.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountHoldingInformationV05.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountHoldingInformationV05";
				definition = "Scope\r\nAn executing party, for example, a (old) plan manager (Transferor), sends the AccountHoldingInformation message to the instructing party, for example, a (new) plan manager (Transferee), to provide information about financial instruments held on behalf of a client.\r\nUsage\r\nThe AccountHoldingInformation message is used to provide information about one or more ISA or portfolio products held in a client's account.";
				previousVersion_lazy = () -> AccountHoldingInformationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctHldgInf";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmMessageReference, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmPoolReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmPreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmRelatedReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmBusinessFlowDirectionType, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmPrimaryIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmSecondaryIndividualInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmOtherIndividualInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmPrimaryCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmSecondaryCorporateInvestor,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmOtherCorporateInvestor, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmTransferorAccount,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmNomineeAccount, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmTransferee,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmProductTransfer, com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "018";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountHoldingInformationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgRef", required = true)
	public MessageIdentification1 getMessageReference() {
		return messageReference;
	}

	public void setMessageReference(MessageIdentification1 messageReference) {
		this.messageReference = messageReference;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference6 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference6 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public AdditionalReference6 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference6 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference6 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "BizFlowDrctnTp")
	public BusinessFlowDirectionType1Code getBusinessFlowDirectionType() {
		return businessFlowDirectionType;
	}

	public void setBusinessFlowDirectionType(BusinessFlowDirectionType1Code businessFlowDirectionType) {
		this.businessFlowDirectionType = businessFlowDirectionType;
	}

	@XmlElement(name = "PmryIndvInvstr")
	public IndividualPerson8 getPrimaryIndividualInvestor() {
		return primaryIndividualInvestor;
	}

	public void setPrimaryIndividualInvestor(IndividualPerson8 primaryIndividualInvestor) {
		this.primaryIndividualInvestor = primaryIndividualInvestor;
	}

	@XmlElement(name = "ScndryIndvInvstr")
	public IndividualPerson8 getSecondaryIndividualInvestor() {
		return secondaryIndividualInvestor;
	}

	public void setSecondaryIndividualInvestor(IndividualPerson8 secondaryIndividualInvestor) {
		this.secondaryIndividualInvestor = secondaryIndividualInvestor;
	}

	@XmlElement(name = "OthrIndvInvstr")
	public List<IndividualPerson8> getOtherIndividualInvestor() {
		return otherIndividualInvestor;
	}

	public void setOtherIndividualInvestor(List<IndividualPerson8> otherIndividualInvestor) {
		this.otherIndividualInvestor = otherIndividualInvestor;
	}

	@XmlElement(name = "PmryCorpInvstr")
	public Organisation21 getPrimaryCorporateInvestor() {
		return primaryCorporateInvestor;
	}

	public void setPrimaryCorporateInvestor(Organisation21 primaryCorporateInvestor) {
		this.primaryCorporateInvestor = primaryCorporateInvestor;
	}

	@XmlElement(name = "ScndryCorpInvstr")
	public Organisation21 getSecondaryCorporateInvestor() {
		return secondaryCorporateInvestor;
	}

	public void setSecondaryCorporateInvestor(Organisation21 secondaryCorporateInvestor) {
		this.secondaryCorporateInvestor = secondaryCorporateInvestor;
	}

	@XmlElement(name = "OthrCorpInvstr")
	public List<Organisation21> getOtherCorporateInvestor() {
		return otherCorporateInvestor;
	}

	public void setOtherCorporateInvestor(List<Organisation21> otherCorporateInvestor) {
		this.otherCorporateInvestor = otherCorporateInvestor;
	}

	@XmlElement(name = "TrfrAcct", required = true)
	public Account19 getTransferorAccount() {
		return transferorAccount;
	}

	public void setTransferorAccount(Account19 transferorAccount) {
		this.transferorAccount = transferorAccount;
	}

	@XmlElement(name = "NmneeAcct")
	public Account19 getNomineeAccount() {
		return nomineeAccount;
	}

	public void setNomineeAccount(Account19 nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
	}

	@XmlElement(name = "Trfee", required = true)
	public PartyIdentification70Choice getTransferee() {
		return transferee;
	}

	public void setTransferee(PartyIdentification70Choice transferee) {
		this.transferee = transferee;
	}

	@XmlElement(name = "PdctTrf", required = true)
	public List<ISATransfer23> getProductTransfer() {
		return productTransfer;
	}

	public void setProductTransfer(List<ISATransfer23> productTransfer) {
		this.productTransfer = productTransfer;
	}

	@XmlElement(name = "MktPrctcVrsn")
	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.018.05.05")
	static public class Document {
		@XmlElement(name = "AcctHldgInf", required = true)
		public AccountHoldingInformationV05 messageBody;
	}
}