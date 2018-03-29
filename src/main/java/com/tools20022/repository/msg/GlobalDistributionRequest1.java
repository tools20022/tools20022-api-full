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
import com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01;
import com.tools20022.repository.choice.CorporateActionOption1FormatChoice;
import com.tools20022.repository.choice.DateFormat4Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionDeadline;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashMovement1;
import com.tools20022.repository.msg.SecurityMovement1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the global distribution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmPreadviceIndicator
 * GlobalDistributionRequest1.mmPreadviceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionNumber
 * GlobalDistributionRequest1.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmOptionType
 * GlobalDistributionRequest1.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmRecordDate
 * GlobalDistributionRequest1.mmRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmPaymentDate
 * GlobalDistributionRequest1.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmSecuritiesMovement
 * GlobalDistributionRequest1.mmSecuritiesMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmCashMovement
 * GlobalDistributionRequest1.mmCashMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
 * CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmGlobalDistributionDetails
 * AgentCAGlobalDistributionAuthorisationRequestV01.mmGlobalDistributionDetails}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMovementRule#forGlobalDistributionRequest1
 * ConstraintMovementRule.forGlobalDistributionRequest1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GlobalDistributionRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the global distribution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GlobalDistributionRequest1", propOrder = {"preadviceIndicator", "optionNumber", "optionType", "recordDate", "paymentDate", "securitiesMovement", "cashMovement"})
public class GlobalDistributionRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PradvcInd", required = true)
	protected YesNoIndicator preadviceIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PradvcInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreadviceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates wether is message is an advice or pre-advice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GlobalDistributionRequest1, YesNoIndicator> mmPreadviceIndicator = new MMMessageAttribute<GlobalDistributionRequest1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "PradvcInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreadviceIndicator";
			definition = "Indicates wether is message is an advice or pre-advice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(GlobalDistributionRequest1 obj) {
			return obj.getPreadviceIndicator();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, YesNoIndicator value) {
			obj.setPreadviceIndicator(value);
		}
	};
	@XmlElement(name = "OptnNb", required = true)
	protected Exact3NumericText optionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GlobalDistributionRequest1, Exact3NumericText> mmOptionNumber = new MMMessageAttribute<GlobalDistributionRequest1, Exact3NumericText>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Exact3NumericText getValue(GlobalDistributionRequest1 obj) {
			return obj.getOptionNumber();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, Exact3NumericText value) {
			obj.setOptionNumber(value);
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GlobalDistributionRequest1, CorporateActionOption1FormatChoice> mmOptionType = new MMMessageAttribute<GlobalDistributionRequest1, CorporateActionOption1FormatChoice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}

		@Override
		public CorporateActionOption1FormatChoice getValue(GlobalDistributionRequest1 obj) {
			return obj.getOptionType();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, CorporateActionOption1FormatChoice value) {
			obj.setOptionType(value);
		}
	};
	@XmlElement(name = "RcrdDt", required = true)
	protected DateFormat4Choice recordDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDeadline#mmRecordDate
	 * CorporateActionDeadline.mmRecordDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the holders of securities are/will be recorded for the income being paid or for entitlement to the rights or offer/privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GlobalDistributionRequest1, DateFormat4Choice> mmRecordDate = new MMMessageAttribute<GlobalDistributionRequest1, DateFormat4Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDeadline.mmRecordDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "RcrdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDate";
			definition = "Date on which the holders of securities are/will be recorded for the income being paid or for entitlement to the rights or offer/privilege.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public DateFormat4Choice getValue(GlobalDistributionRequest1 obj) {
			return obj.getRecordDate();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, DateFormat4Choice value) {
			obj.setRecordDate(value);
		}
	};
	@XmlElement(name = "PmtDt", required = true)
	protected DateFormat4Choice paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat4Choice
	 * DateFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmMovementDate
	 * CorporateActionDistribution.mmMovementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which securities/cash will be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GlobalDistributionRequest1, DateFormat4Choice> mmPaymentDate = new MMMessageAttribute<GlobalDistributionRequest1, DateFormat4Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmMovementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "PmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDate";
			definition = "Date on which securities/cash will be paid.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat4Choice.mmObject();
		}

		@Override
		public DateFormat4Choice getValue(GlobalDistributionRequest1 obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, DateFormat4Choice value) {
			obj.setPaymentDate(value);
		}
	};
	@XmlElement(name = "SctiesMvmnt")
	protected List<SecurityMovement1> securitiesMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityMovement1
	 * SecurityMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the securities movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GlobalDistributionRequest1, List<SecurityMovement1>> mmSecuritiesMovement = new MMMessageAssociationEnd<GlobalDistributionRequest1, List<SecurityMovement1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovement";
			definition = "Provides information about the securities movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityMovement1.mmObject();
		}

		@Override
		public List<SecurityMovement1> getValue(GlobalDistributionRequest1 obj) {
			return obj.getSecuritiesMovement();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, List<SecurityMovement1> value) {
			obj.setSecuritiesMovement(value);
		}
	};
	@XmlElement(name = "CshMvmnt")
	protected List<CashMovement1> cashMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashMovement1
	 * CashMovement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshMvmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the cash movement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GlobalDistributionRequest1, List<CashMovement1>> mmCashMovement = new MMMessageAssociationEnd<GlobalDistributionRequest1, List<CashMovement1>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.GlobalDistributionRequest1.mmObject();
			isDerived = false;
			xmlTag = "CshMvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashMovement";
			definition = "Provides information about the cash movement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashMovement1.mmObject();
		}

		@Override
		public List<CashMovement1> getValue(GlobalDistributionRequest1 obj) {
			return obj.getCashMovement();
		}

		@Override
		public void setValue(GlobalDistributionRequest1 obj, List<CashMovement1> value) {
			obj.setCashMovement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GlobalDistributionRequest1.mmPreadviceIndicator, com.tools20022.repository.msg.GlobalDistributionRequest1.mmOptionNumber,
						com.tools20022.repository.msg.GlobalDistributionRequest1.mmOptionType, com.tools20022.repository.msg.GlobalDistributionRequest1.mmRecordDate, com.tools20022.repository.msg.GlobalDistributionRequest1.mmPaymentDate,
						com.tools20022.repository.msg.GlobalDistributionRequest1.mmSecuritiesMovement, com.tools20022.repository.msg.GlobalDistributionRequest1.mmCashMovement);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAGlobalDistributionAuthorisationRequestV01.mmGlobalDistributionDetails);
				trace_lazy = () -> CorporateActionDistribution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMovementRule.forGlobalDistributionRequest1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GlobalDistributionRequest1";
				definition = "Provides information about the global distribution.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getPreadviceIndicator() {
		return preadviceIndicator;
	}

	public GlobalDistributionRequest1 setPreadviceIndicator(YesNoIndicator preadviceIndicator) {
		this.preadviceIndicator = Objects.requireNonNull(preadviceIndicator);
		return this;
	}

	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public GlobalDistributionRequest1 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = Objects.requireNonNull(optionNumber);
		return this;
	}

	public CorporateActionOption1FormatChoice getOptionType() {
		return optionType;
	}

	public GlobalDistributionRequest1 setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public DateFormat4Choice getRecordDate() {
		return recordDate;
	}

	public GlobalDistributionRequest1 setRecordDate(DateFormat4Choice recordDate) {
		this.recordDate = Objects.requireNonNull(recordDate);
		return this;
	}

	public DateFormat4Choice getPaymentDate() {
		return paymentDate;
	}

	public GlobalDistributionRequest1 setPaymentDate(DateFormat4Choice paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public List<SecurityMovement1> getSecuritiesMovement() {
		return securitiesMovement == null ? securitiesMovement = new ArrayList<>() : securitiesMovement;
	}

	public GlobalDistributionRequest1 setSecuritiesMovement(List<SecurityMovement1> securitiesMovement) {
		this.securitiesMovement = Objects.requireNonNull(securitiesMovement);
		return this;
	}

	public List<CashMovement1> getCashMovement() {
		return cashMovement == null ? cashMovement = new ArrayList<>() : cashMovement;
	}

	public GlobalDistributionRequest1 setCashMovement(List<CashMovement1> cashMovement) {
		this.cashMovement = Objects.requireNonNull(cashMovement);
		return this;
	}
}