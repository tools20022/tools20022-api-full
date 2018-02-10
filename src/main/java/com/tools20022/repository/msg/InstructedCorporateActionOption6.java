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
import com.tools20022.repository.choice.BalanceFormat5Choice;
import com.tools20022.repository.choice.CorporateActionOption18Choice;
import com.tools20022.repository.choice.DeadlineCode3Choice;
import com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionOption;
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
 * Provides corporate action option details about total instructed balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionNumber
 * InstructedCorporateActionOption6.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmOptionType
 * InstructedCorporateActionOption6.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmInstructedBalance
 * InstructedCorporateActionOption6.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDefaultAction
 * InstructedCorporateActionOption6.mmDefaultAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineDateTime
 * InstructedCorporateActionOption6.mmDeadlineDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmDeadlineType
 * InstructedCorporateActionOption6.mmDeadlineType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionOption
 * CorporateActionOption}</li>
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
 * "InstructedCorporateActionOption6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides corporate action option details about total instructed balance."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8
 * InstructedCorporateActionOption8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4
 * InstructedCorporateActionOption4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructedCorporateActionOption6", propOrder = {"optionNumber", "optionType", "instructedBalance", "defaultAction", "deadlineDateTime", "deadlineType"})
public class InstructedCorporateActionOption6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OptnNb")
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
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13A::CAON</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionNumber
	 * InstructedCorporateActionOption8.mmOptionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmOptionNumber
	 * InstructedCorporateActionOption4.mmOptionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13A::CAON"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			nextVersions_lazy = () -> Arrays.asList(InstructedCorporateActionOption8.mmOptionNumber);
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmOptionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "OptnTp", required = true)
	protected CorporateActionOption18Choice optionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption18Choice
	 * CorporateActionOption18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAOP</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmOptionType
	 * InstructedCorporateActionOption8.mmOptionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmOptionType
	 * InstructedCorporateActionOption4.mmOptionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAOP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InstructedCorporateActionOption8.mmOptionType);
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmOptionType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionOption18Choice.mmObject();
		}
	};
	@XmlElement(name = "InstdBal", required = true)
	protected BalanceFormat5Choice instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
	 * BalanceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::INBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmInstructedBalance
	 * InstructedCorporateActionOption8.mmInstructedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmInstructedBalance
	 * InstructedCorporateActionOption4.mmInstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::INBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			nextVersions_lazy = () -> Arrays.asList(InstructedCorporateActionOption8.mmInstructedBalance);
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmInstructedBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	@XmlElement(name = "DfltActn")
	protected DefaultProcessingOrStandingInstruction1Choice defaultAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::DFLT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the default action related to a corporate action event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmDefaultAction
	 * InstructedCorporateActionOption8.mmDefaultAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmDefaultAction
	 * InstructedCorporateActionOption4.mmDefaultAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "DfltActn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::DFLT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultAction";
			definition = "Indicates the default action related to a corporate action event.";
			nextVersions_lazy = () -> Arrays.asList(InstructedCorporateActionOption8.mmDefaultAction);
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmDefaultAction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
		}
	};
	@XmlElement(name = "DdlnDtTm", required = true)
	protected ISODateTime deadlineDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any deadline chosen by the account servicer (service level agreement)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmDeadlineDateTime
	 * InstructedCorporateActionOption4.mmDeadlineDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeadlineDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "DdlnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineDateTime";
			definition = "Any deadline chosen by the account servicer (service level agreement).";
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmDeadlineDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "DdlnTp", required = true)
	protected DeadlineCode3Choice deadlineType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DeadlineCode3Choice
	 * DeadlineCode3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DdlnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeadlineType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of deadline for instructing."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmDeadlineType
	 * InstructedCorporateActionOption4.mmDeadlineType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeadlineType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
			isDerived = false;
			xmlTag = "DdlnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeadlineType";
			definition = "Specifies the type of deadline for instructing.";
			previousVersion_lazy = () -> InstructedCorporateActionOption4.mmDeadlineType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DeadlineCode3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedCorporateActionOption6.mmOptionNumber, com.tools20022.repository.msg.InstructedCorporateActionOption6.mmOptionType,
						com.tools20022.repository.msg.InstructedCorporateActionOption6.mmInstructedBalance, com.tools20022.repository.msg.InstructedCorporateActionOption6.mmDefaultAction,
						com.tools20022.repository.msg.InstructedCorporateActionOption6.mmDeadlineDateTime, com.tools20022.repository.msg.InstructedCorporateActionOption6.mmDeadlineType);
				trace_lazy = () -> CorporateActionOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedCorporateActionOption6";
				definition = "Provides corporate action option details about total instructed balance.";
				nextVersions_lazy = () -> Arrays.asList(InstructedCorporateActionOption8.mmObject());
				previousVersion_lazy = () -> InstructedCorporateActionOption4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Exact3NumericText> getOptionNumber() {
		return optionNumber == null ? Optional.empty() : Optional.of(optionNumber);
	}

	public InstructedCorporateActionOption6 setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
		return this;
	}

	public CorporateActionOption18Choice getOptionType() {
		return optionType;
	}

	public InstructedCorporateActionOption6 setOptionType(CorporateActionOption18Choice optionType) {
		this.optionType = Objects.requireNonNull(optionType);
		return this;
	}

	public BalanceFormat5Choice getInstructedBalance() {
		return instructedBalance;
	}

	public InstructedCorporateActionOption6 setInstructedBalance(BalanceFormat5Choice instructedBalance) {
		this.instructedBalance = Objects.requireNonNull(instructedBalance);
		return this;
	}

	public Optional<DefaultProcessingOrStandingInstruction1Choice> getDefaultAction() {
		return defaultAction == null ? Optional.empty() : Optional.of(defaultAction);
	}

	public InstructedCorporateActionOption6 setDefaultAction(DefaultProcessingOrStandingInstruction1Choice defaultAction) {
		this.defaultAction = defaultAction;
		return this;
	}

	public ISODateTime getDeadlineDateTime() {
		return deadlineDateTime;
	}

	public InstructedCorporateActionOption6 setDeadlineDateTime(ISODateTime deadlineDateTime) {
		this.deadlineDateTime = Objects.requireNonNull(deadlineDateTime);
		return this;
	}

	public DeadlineCode3Choice getDeadlineType() {
		return deadlineType;
	}

	public InstructedCorporateActionOption6 setDeadlineType(DeadlineCode3Choice deadlineType) {
		this.deadlineType = Objects.requireNonNull(deadlineType);
		return this;
	}
}