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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.Investor;
import com.tools20022.repository.msg.DeMinimusApplicable1;
import com.tools20022.repository.msg.DeMinimusNotApplicable1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * De minimus applicability conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#DeMinimusApplicable
 * DeMinimus1Choice.DeMinimusApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#DeMinimusNotApplicable
 * DeMinimus1Choice.DeMinimusNotApplicable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
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
 * "DeMinimus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "De minimus applicability conditions."</li>
 * </ul>
 */
public class DeMinimus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Conditions applicable when the investor is covered by the "de minimis"
	 * exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeMinimusApplicable1
	 * DeMinimusApplicable1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor#DeMinimusApplicable
	 * Investor.DeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice
	 * DeMinimus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeMnmsAplbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions applicable when the investor is covered by the \"de minimis\" exemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeMinimusApplicable = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeMinimus1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Investor.DeMinimusApplicable;
			isDerived = false;
			xmlTag = "DeMnmsAplbl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Conditions applicable when the investor is covered by the \"de minimis\" exemption.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DeMinimusApplicable1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Conditions applicable when the investor is not covered by the
	 * "de minimis" exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeMinimusNotApplicable1
	 * DeMinimusNotApplicable1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Investor#DeMinimusApplicable
	 * Investor.DeMinimusApplicable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice
	 * DeMinimus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeMnmsNotAplbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeMinimusNotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditions applicable when the investor is not covered by the \"de minimis\" exemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DeMinimusNotApplicable = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DeMinimus1Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Investor.DeMinimusApplicable;
			isDerived = false;
			xmlTag = "DeMnmsNotAplbl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusNotApplicable";
			definition = "Conditions applicable when the investor is not covered by the \"de minimis\" exemption.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DeMinimusNotApplicable1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DeMinimus1Choice.DeMinimusApplicable, com.tools20022.repository.choice.DeMinimus1Choice.DeMinimusNotApplicable);
				trace_lazy = () -> Investor.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeMinimus1Choice";
				definition = "De minimus applicability conditions.";
			}
		});
		return mmObject_lazy.get();
	}
}