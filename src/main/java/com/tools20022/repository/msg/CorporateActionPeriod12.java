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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.Period6Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies periods related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmPriceCalculationPeriod
 * CorporateActionPeriod12.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmParallelTradingPeriod
 * CorporateActionPeriod12.mmParallelTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmActionPeriod
 * CorporateActionPeriod12.mmActionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmRevocabilityPeriod
 * CorporateActionPeriod12.mmRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmPrivilegeSuspensionPeriod
 * CorporateActionPeriod12.mmPrivilegeSuspensionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmAccountServicerRevocabilityPeriod
 * CorporateActionPeriod12.mmAccountServicerRevocabilityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12#mmDepositorySuspensionPeriodForWithdrawal
 * CorporateActionPeriod12.mmDepositorySuspensionPeriodForWithdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPeriod12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies periods related to a corporate action option."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7
 * CorporateActionPeriod7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionPeriod12", propOrder = {"priceCalculationPeriod", "parallelTradingPeriod", "actionPeriod", "revocabilityPeriod", "privilegeSuspensionPeriod", "accountServicerRevocabilityPeriod",
		"depositorySuspensionPeriodForWithdrawal"})
public class CorporateActionPeriod12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PricClctnPrd")
	protected Period6Choice priceCalculationPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
	 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricClctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a:PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPriceCalculationPeriod
	 * CorporateActionPeriod7.mmPriceCalculationPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmPriceCalculationPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceCalculationPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "PricClctnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a:PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmPriceCalculationPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getPriceCalculationPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setPriceCalculationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ParllTradgPrd")
	protected Period6Choice parallelTradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmParallelTradingPeriod
	 * SecuritiesProceedsDefinition.mmParallelTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParllTradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::PARL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParallelTradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmParallelTradingPeriod
	 * CorporateActionPeriod7.mmParallelTradingPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmParallelTradingPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmParallelTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "ParllTradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::PARL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParallelTradingPeriod";
			definition = "Period during which both old and new equity may be traded simultaneously, for example, consolidation of equity or splitting of equity.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmParallelTradingPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getParallelTradingPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setParallelTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ActnPrd")
	protected Period6Choice actionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmActionPeriod
	 * CorporateActionOption.mmActionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::PWAL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the specified option, or all options of the event, remains valid, for example, offer period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmActionPeriod
	 * CorporateActionPeriod7.mmActionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmActionPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmActionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "ActnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::PWAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionPeriod";
			definition = "Period during which the specified option, or all options of the event, remains valid, for example, offer period.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmActionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getActionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setActionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "RvcbltyPrd")
	protected Period6Choice revocabilityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
	 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvcbltyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::REVO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the shareholder can revoke, change or withdraw its instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmRevocabilityPeriod
	 * CorporateActionPeriod7.mmRevocabilityPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmRevocabilityPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "RvcbltyPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::REVO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevocabilityPeriod";
			definition = "Period during which the shareholder can revoke, change or withdraw its instruction.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmRevocabilityPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getRevocabilityPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setRevocabilityPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvlgSspnsnPrd")
	protected Period6Choice privilegeSuspensionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmPrivilegeSuspensionPeriod
	 * SuspensionPeriod.mmPrivilegeSuspensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvlgSspnsnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::SUSP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivilegeSuspensionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the privilege is not available, for example, this can happen whenever a meeting takes place or whenever a coupon payment is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPrivilegeSuspensionPeriod
	 * CorporateActionPeriod7.mmPrivilegeSuspensionPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmPrivilegeSuspensionPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmPrivilegeSuspensionPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "PrvlgSspnsnPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::SUSP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivilegeSuspensionPeriod";
			definition = "Period during which the privilege is not available, for example, this can happen whenever a meeting takes place or whenever a coupon payment is due.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmPrivilegeSuspensionPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getPrivilegeSuspensionPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setPrivilegeSuspensionPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrRvcbltyPrd")
	protected Period6Choice accountServicerRevocabilityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRevocabilityPeriod
	 * CorporateActionDeadline.mmRevocabilityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRvcbltyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::AREV:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerRevocabilityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the participant of the account servicer can revoke change or withdraw its instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmAccountServicerRevocabilityPeriod
	 * CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmAccountServicerRevocabilityPeriod = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRevocabilityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrRvcbltyPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::AREV:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerRevocabilityPeriod";
			definition = "Period during which the participant of the account servicer can revoke change or withdraw its instructions.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmAccountServicerRevocabilityPeriod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getAccountServicerRevocabilityPeriod();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setAccountServicerRevocabilityPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstrySspnsnPrdForWdrwl")
	protected Period6Choice depositorySuspensionPeriodForWithdrawal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period6Choice
	 * Period6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuspensionPeriod#mmDepositorySuspensionPeriodForWithdrawal
	 * SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod12
	 * CorporateActionPeriod12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstrySspnsnPrdForWdrwl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::DSWO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositorySuspensionPeriodForWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmDepositorySuspensionPeriodForWithdrawal
	 * CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>> mmDepositorySuspensionPeriodForWithdrawal = new MMMessageAssociationEnd<CorporateActionPeriod12, Optional<Period6Choice>>() {
		{
			businessElementTrace_lazy = () -> SuspensionPeriod.mmDepositorySuspensionPeriodForWithdrawal;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionPeriod12.mmObject();
			isDerived = false;
			xmlTag = "DpstrySspnsnPrdForWdrwl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::DSWO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositorySuspensionPeriodForWithdrawal";
			definition = "Period defining the last date on which withdrawal in street name requests on the outturn security will be accepted and the date on which the suspension will be released and withdrawal by transfer processing on the outturn security will resume.";
			previousVersion_lazy = () -> CorporateActionPeriod7.mmDepositorySuspensionPeriodForWithdrawal;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period6Choice.mmObject();
		}

		@Override
		public Optional<Period6Choice> getValue(CorporateActionPeriod12 obj) {
			return obj.getDepositorySuspensionPeriodForWithdrawal();
		}

		@Override
		public void setValue(CorporateActionPeriod12 obj, Optional<Period6Choice> value) {
			obj.setDepositorySuspensionPeriodForWithdrawal(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod12.mmPriceCalculationPeriod, com.tools20022.repository.msg.CorporateActionPeriod12.mmParallelTradingPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod12.mmActionPeriod, com.tools20022.repository.msg.CorporateActionPeriod12.mmRevocabilityPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod12.mmPrivilegeSuspensionPeriod, com.tools20022.repository.msg.CorporateActionPeriod12.mmAccountServicerRevocabilityPeriod,
						com.tools20022.repository.msg.CorporateActionPeriod12.mmDepositorySuspensionPeriodForWithdrawal);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPeriod12";
				definition = "Specifies periods related to a corporate action option.";
				previousVersion_lazy = () -> CorporateActionPeriod7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Period6Choice> getPriceCalculationPeriod() {
		return priceCalculationPeriod == null ? Optional.empty() : Optional.of(priceCalculationPeriod);
	}

	public CorporateActionPeriod12 setPriceCalculationPeriod(Period6Choice priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
		return this;
	}

	public Optional<Period6Choice> getParallelTradingPeriod() {
		return parallelTradingPeriod == null ? Optional.empty() : Optional.of(parallelTradingPeriod);
	}

	public CorporateActionPeriod12 setParallelTradingPeriod(Period6Choice parallelTradingPeriod) {
		this.parallelTradingPeriod = parallelTradingPeriod;
		return this;
	}

	public Optional<Period6Choice> getActionPeriod() {
		return actionPeriod == null ? Optional.empty() : Optional.of(actionPeriod);
	}

	public CorporateActionPeriod12 setActionPeriod(Period6Choice actionPeriod) {
		this.actionPeriod = actionPeriod;
		return this;
	}

	public Optional<Period6Choice> getRevocabilityPeriod() {
		return revocabilityPeriod == null ? Optional.empty() : Optional.of(revocabilityPeriod);
	}

	public CorporateActionPeriod12 setRevocabilityPeriod(Period6Choice revocabilityPeriod) {
		this.revocabilityPeriod = revocabilityPeriod;
		return this;
	}

	public Optional<Period6Choice> getPrivilegeSuspensionPeriod() {
		return privilegeSuspensionPeriod == null ? Optional.empty() : Optional.of(privilegeSuspensionPeriod);
	}

	public CorporateActionPeriod12 setPrivilegeSuspensionPeriod(Period6Choice privilegeSuspensionPeriod) {
		this.privilegeSuspensionPeriod = privilegeSuspensionPeriod;
		return this;
	}

	public Optional<Period6Choice> getAccountServicerRevocabilityPeriod() {
		return accountServicerRevocabilityPeriod == null ? Optional.empty() : Optional.of(accountServicerRevocabilityPeriod);
	}

	public CorporateActionPeriod12 setAccountServicerRevocabilityPeriod(Period6Choice accountServicerRevocabilityPeriod) {
		this.accountServicerRevocabilityPeriod = accountServicerRevocabilityPeriod;
		return this;
	}

	public Optional<Period6Choice> getDepositorySuspensionPeriodForWithdrawal() {
		return depositorySuspensionPeriodForWithdrawal == null ? Optional.empty() : Optional.of(depositorySuspensionPeriodForWithdrawal);
	}

	public CorporateActionPeriod12 setDepositorySuspensionPeriodForWithdrawal(Period6Choice depositorySuspensionPeriodForWithdrawal) {
		this.depositorySuspensionPeriodForWithdrawal = depositorySuspensionPeriodForWithdrawal;
		return this;
	}
}