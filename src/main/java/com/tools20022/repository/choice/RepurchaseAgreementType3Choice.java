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
import com.tools20022.repository.msg.GeneralCollateral3;
import com.tools20022.repository.msg.SpecificCollateral2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the type of repurchase agreeement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType3Choice#mmSpecificCollateral
 * RepurchaseAgreementType3Choice.mmSpecificCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType3Choice#mmGeneralCollateral
 * RepurchaseAgreementType3Choice.mmGeneralCollateral}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseAgreementType3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of repurchase agreeement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType1Choice
 * RepurchaseAgreementType1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RepurchaseAgreementType3Choice", propOrder = {"specificCollateral", "generalCollateral"})
public class RepurchaseAgreementType3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SpcfcColl", required = true)
	protected SpecificCollateral2 specificCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SpecificCollateral2
	 * SpecificCollateral2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType3Choice
	 * RepurchaseAgreementType3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpcfcColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecificCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the repurchase agreement is where a single, pre defined, financial instrument is sold and repurchased."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType1Choice#mmSpecificCollateral
	 * RepurchaseAgreementType1Choice.mmSpecificCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSpecificCollateral = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RepurchaseAgreementType3Choice.mmObject();
			isDerived = false;
			xmlTag = "SpcfcColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecificCollateral";
			definition = "Indicates that the repurchase agreement is where a single, pre defined, financial instrument is sold and repurchased.";
			previousVersion_lazy = () -> RepurchaseAgreementType1Choice.mmSpecificCollateral;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SpecificCollateral2.mmObject();
		}
	};
	@XmlElement(name = "GnlColl", required = true)
	protected GeneralCollateral3 generalCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GeneralCollateral3
	 * GeneralCollateral3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType3Choice
	 * RepurchaseAgreementType3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnlColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneralCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the repurchase agreement allows for the sale and repurchase of any of a selection of assets from a pool of eligible assets."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType1Choice#mmGeneralCollateral
	 * RepurchaseAgreementType1Choice.mmGeneralCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGeneralCollateral = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RepurchaseAgreementType3Choice.mmObject();
			isDerived = false;
			xmlTag = "GnlColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneralCollateral";
			definition = "Indicates that the repurchase agreement allows for the sale and repurchase of any of a selection of assets from a pool of eligible assets.";
			previousVersion_lazy = () -> RepurchaseAgreementType1Choice.mmGeneralCollateral;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GeneralCollateral3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RepurchaseAgreementType3Choice.mmSpecificCollateral, com.tools20022.repository.choice.RepurchaseAgreementType3Choice.mmGeneralCollateral);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RepurchaseAgreementType3Choice";
				definition = "Specifies the type of repurchase agreeement.";
				previousVersion_lazy = () -> RepurchaseAgreementType1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SpecificCollateral2 getSpecificCollateral() {
		return specificCollateral;
	}

	public RepurchaseAgreementType3Choice setSpecificCollateral(SpecificCollateral2 specificCollateral) {
		this.specificCollateral = Objects.requireNonNull(specificCollateral);
		return this;
	}

	public GeneralCollateral3 getGeneralCollateral() {
		return generalCollateral;
	}

	public RepurchaseAgreementType3Choice setGeneralCollateral(GeneralCollateral3 generalCollateral) {
		this.generalCollateral = Objects.requireNonNull(generalCollateral);
		return this;
	}
}