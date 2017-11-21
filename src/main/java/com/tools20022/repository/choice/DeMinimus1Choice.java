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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Investor;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DeMinimusApplicable1;
import com.tools20022.repository.msg.DeMinimusNotApplicable1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#mmDeMinimusApplicable
 * DeMinimus1Choice.mmDeMinimusApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DeMinimus1Choice#mmDeMinimusNotApplicable
 * DeMinimus1Choice.mmDeMinimusNotApplicable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Investor Investor}</li>
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
 * "DeMinimus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "De minimus applicability conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DeMinimus1Choice", propOrder = {"deMinimusApplicable", "deMinimusNotApplicable"})
public class DeMinimus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DeMinimusApplicable1 deMinimusApplicable;
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
	 * {@linkplain com.tools20022.repository.entity.Investor#mmDeMinimusApplicable
	 * Investor.mmDeMinimusApplicable}</li>
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
	public static final MMMessageAssociationEnd mmDeMinimusApplicable = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Investor.mmDeMinimusApplicable;
			componentContext_lazy = () -> DeMinimus1Choice.mmObject();
			isDerived = false;
			xmlTag = "DeMnmsAplbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusApplicable";
			definition = "Conditions applicable when the investor is covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeMinimusApplicable1.mmObject();
		}
	};
	protected DeMinimusNotApplicable1 deMinimusNotApplicable;
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
	 * {@linkplain com.tools20022.repository.entity.Investor#mmDeMinimusApplicable
	 * Investor.mmDeMinimusApplicable}</li>
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
	public static final MMMessageAssociationEnd mmDeMinimusNotApplicable = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Investor.mmDeMinimusApplicable;
			componentContext_lazy = () -> DeMinimus1Choice.mmObject();
			isDerived = false;
			xmlTag = "DeMnmsNotAplbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeMinimusNotApplicable";
			definition = "Conditions applicable when the investor is not covered by the \"de minimis\" exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeMinimusNotApplicable1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DeMinimus1Choice.mmDeMinimusApplicable, DeMinimus1Choice.mmDeMinimusNotApplicable);
				trace_lazy = () -> Investor.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeMinimus1Choice";
				definition = "De minimus applicability conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DeMnmsAplbl", required = true)
	public DeMinimusApplicable1 getDeMinimusApplicable() {
		return deMinimusApplicable;
	}

	public void setDeMinimusApplicable(DeMinimusApplicable1 deMinimusApplicable) {
		this.deMinimusApplicable = deMinimusApplicable;
	}

	@XmlElement(name = "DeMnmsNotAplbl", required = true)
	public DeMinimusNotApplicable1 getDeMinimusNotApplicable() {
		return deMinimusNotApplicable;
	}

	public void setDeMinimusNotApplicable(DeMinimusNotApplicable1 deMinimusNotApplicable) {
		this.deMinimusNotApplicable = deMinimusNotApplicable;
	}
}