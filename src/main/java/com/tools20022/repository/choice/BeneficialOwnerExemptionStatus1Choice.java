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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DeceasedExemptionStatus1;
import com.tools20022.repository.msg.IncompetentExemptionStatus1;
import com.tools20022.repository.msg.NonExemptExemptionStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Exemption reason for the beneficial owner. Usually applicable for CD (Cash
 * Deposit) Early Redemption events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice#mmDeceased
 * BeneficialOwnerExemptionStatus1Choice.mmDeceased}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice#mmIncompetent
 * BeneficialOwnerExemptionStatus1Choice.mmIncompetent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice#mmNonExempt
 * BeneficialOwnerExemptionStatus1Choice.mmNonExempt}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficialOwnerExemptionStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Exemption reason for the beneficial owner. Usually applicable for CD (Cash Deposit) Early Redemption events."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BeneficialOwnerExemptionStatus1Choice", propOrder = {"deceased", "incompetent", "nonExempt"})
public class BeneficialOwnerExemptionStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DeceasedExemptionStatus1 deceased;
	/**
	 * Beneficial owner is deceased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeceasedExemptionStatus1
	 * DeceasedExemptionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice
	 * BeneficialOwnerExemptionStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dcsd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deceased"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner is deceased."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeceased = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BeneficialOwnerExemptionStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Dcsd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deceased";
			definition = "Beneficial owner is deceased.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DeceasedExemptionStatus1.mmObject();
		}
	};
	protected IncompetentExemptionStatus1 incompetent;
	/**
	 * Beneficial owner is incompetent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.IncompetentExemptionStatus1
	 * IncompetentExemptionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice
	 * BeneficialOwnerExemptionStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incmptnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incompetent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner is incompetent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncompetent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BeneficialOwnerExemptionStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "Incmptnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incompetent";
			definition = "Beneficial owner is incompetent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IncompetentExemptionStatus1.mmObject();
		}
	};
	protected NonExemptExemptionStatus1 nonExempt;
	/**
	 * Beneficial owner is non-exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NonExemptExemptionStatus1
	 * NonExemptExemptionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BeneficialOwnerExemptionStatus1Choice
	 * BeneficialOwnerExemptionStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonXmpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner is non-exempt."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonExempt = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BeneficialOwnerExemptionStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "NonXmpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExempt";
			definition = "Beneficial owner is non-exempt.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NonExemptExemptionStatus1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BeneficialOwnerExemptionStatus1Choice.mmDeceased, BeneficialOwnerExemptionStatus1Choice.mmIncompetent, BeneficialOwnerExemptionStatus1Choice.mmNonExempt);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BeneficialOwnerExemptionStatus1Choice";
				definition = "Exemption reason for the beneficial owner. Usually applicable for CD (Cash Deposit) Early Redemption events.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Dcsd", required = true)
	public DeceasedExemptionStatus1 getDeceased() {
		return deceased;
	}

	public void setDeceased(DeceasedExemptionStatus1 deceased) {
		this.deceased = deceased;
	}

	@XmlElement(name = "Incmptnt", required = true)
	public IncompetentExemptionStatus1 getIncompetent() {
		return incompetent;
	}

	public void setIncompetent(IncompetentExemptionStatus1 incompetent) {
		this.incompetent = incompetent;
	}

	@XmlElement(name = "NonXmpt", required = true)
	public NonExemptExemptionStatus1 getNonExempt() {
		return nonExempt;
	}

	public void setNonExempt(NonExemptExemptionStatus1 nonExempt) {
		this.nonExempt = nonExempt;
	}
}