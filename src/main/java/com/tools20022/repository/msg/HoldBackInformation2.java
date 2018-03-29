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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecurityIdentification25Choice;
import com.tools20022.repository.codeset.GateHoldBack1Code;
import com.tools20022.repository.codeset.RedemptionCompletion1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about hold back and gating.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmType
 * HoldBackInformation2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmAmount
 * HoldBackInformation2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmExpectedReleaseDate
 * HoldBackInformation2.mmExpectedReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentIdentification
 * HoldBackInformation2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentName
 * HoldBackInformation2.mmFinancialInstrumentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmRedemptionCompletion
 * HoldBackInformation2.mmRedemptionCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinalConfirmation
 * HoldBackInformation2.mmFinalConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
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
 * "HoldBackInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about hold back and gating."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation3
 * HoldBackInformation3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1
 * HoldBackInformation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "HoldBackInformation2", propOrder = {"type", "amount", "expectedReleaseDate", "financialInstrumentIdentification", "financialInstrumentName", "redemptionCompletion", "finalConfirmation"})
public class HoldBackInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected GateHoldBack1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBack1Code
	 * GateHoldBack1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of gating or a hold back."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmType
	 * HoldBackInformation3.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, GateHoldBack1Code> mmType = new MMMessageAttribute<HoldBackInformation2, GateHoldBack1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of gating or a hold back.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GateHoldBack1Code.mmObject();
		}

		@Override
		public GateHoldBack1Code getValue(HoldBackInformation2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, GateHoldBack1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Amt")
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackAmount
	 * InvestmentFundClass.mmHoldBackAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the redemption amount subject to gating or a hold back."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmAmount
	 * HoldBackInformation3.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#mmHoldBackAmount
	 * HoldBackInformation1.mmHoldBackAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, Optional<ActiveCurrencyAndAmount>> mmAmount = new MMMessageAttribute<HoldBackInformation2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmHoldBackAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value of the redemption amount subject to gating or a hold back.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmAmount);
			previousVersion_lazy = () -> HoldBackInformation1.mmHoldBackAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(HoldBackInformation2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdRlsDt")
	protected ISODate expectedReleaseDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackReleaseDate
	 * InvestmentFundClass.mmHoldBackReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdRlsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedReleaseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the gated amount or hold back amount is expected to be released."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmExpectedReleaseDate
	 * HoldBackInformation3.mmExpectedReleaseDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation1#mmHoldBackReleaseDate
	 * HoldBackInformation1.mmHoldBackReleaseDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, Optional<ISODate>> mmExpectedReleaseDate = new MMMessageAttribute<HoldBackInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmHoldBackReleaseDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "XpctdRlsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedReleaseDate";
			definition = "Date on which the gated amount or hold back amount is expected to be released.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmExpectedReleaseDate);
			previousVersion_lazy = () -> HoldBackInformation1.mmHoldBackReleaseDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(HoldBackInformation2 obj) {
			return obj.getExpectedReleaseDate();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<ISODate> value) {
			obj.setExpectedReleaseDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification25Choice financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
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
	 * definition} = "New identification of the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentIdentification
	 * HoldBackInformation3.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<HoldBackInformation2, Optional<SecurityIdentification25Choice>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<HoldBackInformation2, Optional<SecurityIdentification25Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "New identification of the security.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification25Choice.mmObject();
		}

		@Override
		public Optional<SecurityIdentification25Choice> getValue(HoldBackInformation2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<SecurityIdentification25Choice> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmNm")
	protected Max350Text financialInstrumentName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New name of the security."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentName
	 * HoldBackInformation3.mmFinancialInstrumentName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, Optional<Max350Text>> mmFinancialInstrumentName = new MMMessageAttribute<HoldBackInformation2, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmNm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::FIAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentName";
			definition = "New name of the security.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmFinancialInstrumentName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(HoldBackInformation2 obj) {
			return obj.getFinancialInstrumentName();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<Max350Text> value) {
			obj.setFinancialInstrumentName(value.orElse(null));
		}
	};
	@XmlElement(name = "RedCmpltn")
	protected RedemptionCompletion1Code redemptionCompletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code
	 * RedemptionCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedCmpltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether or not additional redemption order instructions are required in order for the redemption to be completed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmRedemptionCompletion
	 * HoldBackInformation3.mmRedemptionCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, Optional<RedemptionCompletion1Code>> mmRedemptionCompletion = new MMMessageAttribute<HoldBackInformation2, Optional<RedemptionCompletion1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "RedCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCompletion";
			definition = "Specifies whether or not additional redemption order instructions are required in order for the redemption to be completed.";
			nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmRedemptionCompletion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RedemptionCompletion1Code.mmObject();
		}

		@Override
		public Optional<RedemptionCompletion1Code> getValue(HoldBackInformation2 obj) {
			return obj.getRedemptionCompletion();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<RedemptionCompletion1Code> value) {
			obj.setRedemptionCompletion(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlConf")
	protected YesNoIndicator finalConfirmation;
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
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not this is the final redemption confirmation in the execution of a gated redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<HoldBackInformation2, Optional<YesNoIndicator>> mmFinalConfirmation = new MMMessageAttribute<HoldBackInformation2, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.HoldBackInformation2.mmObject();
			isDerived = false;
			xmlTag = "FnlConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalConfirmation";
			definition = "Indicates whether or not this is the final redemption confirmation in the execution of a gated redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(HoldBackInformation2 obj) {
			return obj.getFinalConfirmation();
		}

		@Override
		public void setValue(HoldBackInformation2 obj, Optional<YesNoIndicator> value) {
			obj.setFinalConfirmation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.HoldBackInformation2.mmType, com.tools20022.repository.msg.HoldBackInformation2.mmAmount,
						com.tools20022.repository.msg.HoldBackInformation2.mmExpectedReleaseDate, com.tools20022.repository.msg.HoldBackInformation2.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.HoldBackInformation2.mmFinancialInstrumentName, com.tools20022.repository.msg.HoldBackInformation2.mmRedemptionCompletion,
						com.tools20022.repository.msg.HoldBackInformation2.mmFinalConfirmation);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldBackInformation2";
				definition = "Information about hold back and gating.";
				nextVersions_lazy = () -> Arrays.asList(HoldBackInformation3.mmObject());
				previousVersion_lazy = () -> HoldBackInformation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GateHoldBack1Code getType() {
		return type;
	}

	public HoldBackInformation2 setType(GateHoldBack1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public HoldBackInformation2 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<ISODate> getExpectedReleaseDate() {
		return expectedReleaseDate == null ? Optional.empty() : Optional.of(expectedReleaseDate);
	}

	public HoldBackInformation2 setExpectedReleaseDate(ISODate expectedReleaseDate) {
		this.expectedReleaseDate = expectedReleaseDate;
		return this;
	}

	public Optional<SecurityIdentification25Choice> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public HoldBackInformation2 setFinancialInstrumentIdentification(SecurityIdentification25Choice financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<Max350Text> getFinancialInstrumentName() {
		return financialInstrumentName == null ? Optional.empty() : Optional.of(financialInstrumentName);
	}

	public HoldBackInformation2 setFinancialInstrumentName(Max350Text financialInstrumentName) {
		this.financialInstrumentName = financialInstrumentName;
		return this;
	}

	public Optional<RedemptionCompletion1Code> getRedemptionCompletion() {
		return redemptionCompletion == null ? Optional.empty() : Optional.of(redemptionCompletion);
	}

	public HoldBackInformation2 setRedemptionCompletion(RedemptionCompletion1Code redemptionCompletion) {
		this.redemptionCompletion = redemptionCompletion;
		return this;
	}

	public Optional<YesNoIndicator> getFinalConfirmation() {
		return finalConfirmation == null ? Optional.empty() : Optional.of(finalConfirmation);
	}

	public HoldBackInformation2 setFinalConfirmation(YesNoIndicator finalConfirmation) {
		this.finalConfirmation = finalConfirmation;
		return this;
	}
}