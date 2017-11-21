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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between default processing or standing instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice#mmDefaultOptionIndicator
 * DefaultProcessingOrStandingInstruction1Choice.mmDefaultOptionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice#mmStandingInstructionIndicator
 * DefaultProcessingOrStandingInstruction1Choice.mmStandingInstructionIndicator}
 * </li>
 * </ul>
 * </li>
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
 * "DefaultProcessingOrStandingInstruction1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between default processing or standing instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DefaultProcessingOrStandingInstruction1Choice", propOrder = {"defaultOptionIndicator", "standingInstructionIndicator"})
public class DefaultProcessingOrStandingInstruction1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator defaultOptionIndicator;
	/**
	 * Indicates whether the option, for example, currency option, will be
	 * selected by default if no instruction is provided by the account owner.
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
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltOptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultOptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the option, for example, currency option, will be selected by default if no instruction is provided by the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDefaultOptionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
			isDerived = false;
			xmlTag = "DfltOptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOptionIndicator";
			definition = "Indicates whether the option, for example, currency option, will be selected by default if no instruction is provided by the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator standingInstructionIndicator;
	/**
	 * Indicates whether an account owner has placed a standing order to select
	 * this corporate action option.
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
	 * {@linkplain com.tools20022.repository.choice.DefaultProcessingOrStandingInstruction1Choice
	 * DefaultProcessingOrStandingInstruction1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an account owner has placed a standing order to select this corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandingInstructionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> DefaultProcessingOrStandingInstruction1Choice.mmObject();
			isDerived = false;
			xmlTag = "StgInstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionIndicator";
			definition = "Indicates whether an account owner has placed a standing order to select this corporate action option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DefaultProcessingOrStandingInstruction1Choice.mmDefaultOptionIndicator, DefaultProcessingOrStandingInstruction1Choice.mmStandingInstructionIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultProcessingOrStandingInstruction1Choice";
				definition = "Choice between default processing or standing instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DfltOptnInd", required = true)
	public YesNoIndicator getDefaultOptionIndicator() {
		return defaultOptionIndicator;
	}

	public void setDefaultOptionIndicator(YesNoIndicator defaultOptionIndicator) {
		this.defaultOptionIndicator = defaultOptionIndicator;
	}

	@XmlElement(name = "StgInstrInd", required = true)
	public YesNoIndicator getStandingInstructionIndicator() {
		return standingInstructionIndicator;
	}

	public void setStandingInstructionIndicator(YesNoIndicator standingInstructionIndicator) {
		this.standingInstructionIndicator = standingInstructionIndicator;
	}
}