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
import com.tools20022.repository.codeset.ISAType2Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.entity.PortfolioTransfer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice between the selections of individual saving accounts issued during the
 * current fiscal year.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#CurrentYearType
 * CurrentYearType2Choice.CurrentYearType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#ExtendedCurrentYearType
 * CurrentYearType2Choice.ExtendedCurrentYearType}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrentYearType2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the selections of individual saving accounts issued during the current fiscal year."
 * </li>
 * </ul>
 */
public class CurrentYearType2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Current year ISA is an ISA that was issued during the current fiscal
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISAType2Code
	 * ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#CurrentYearISAType
	 * PortfolioTransfer.CurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice
	 * CurrentYearType2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurYrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CurrentYearType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrentYearType2Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.CurrentYearISAType;
			isDerived = false;
			xmlTag = "CurYrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISAType2Code.mmObject();
		}
	};
	/**
	 * Current year ISA is an ISA that was issued during the current fiscal
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#CurrentYearISAType
	 * PortfolioTransfer.CurrentYearISAType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice
	 * CurrentYearType2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCurYrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCurrentYearType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExtendedCurrentYearType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrentYearType2Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.CurrentYearISAType;
			isDerived = false;
			xmlTag = "XtndedCurYrTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCurrentYearType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CurrentYearType2Choice.CurrentYearType, com.tools20022.repository.choice.CurrentYearType2Choice.ExtendedCurrentYearType);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrentYearType2Choice";
				definition = "Choice between the selections of individual saving accounts issued during the current fiscal year.";
			}
		});
		return mmObject_lazy.get();
	}
}