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
import com.tools20022.repository.msg.FinancialInstitutionIdentification9;
import com.tools20022.repository.msg.FinancialInstitutionIdentificationList1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifiers for the central and authorised branches.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice#mmAuthorisedBranchIdentifier
 * CentralisedAndAuthorisedBranchIdentification1Choice.
 * mmAuthorisedBranchIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice#mmCentralisedBranchIdentifiers
 * CentralisedAndAuthorisedBranchIdentification1Choice.
 * mmCentralisedBranchIdentifiers}</li>
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
 * "CentralisedAndAuthorisedBranchIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifiers for the central and authorised branches."</li>
 * </ul>
 */
public class CentralisedAndAuthorisedBranchIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstitutionIdentification9 authorisedBranchIdentifier;
	/**
	 * Identifier of the authorised branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification9
	 * FinancialInstitutionIdentification9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice
	 * CentralisedAndAuthorisedBranchIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthrsdBrnchIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedBranchIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the authorised branch."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisedBranchIdentifier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CentralisedAndAuthorisedBranchIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "AuthrsdBrnchIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisedBranchIdentifier";
			definition = "Identifier of the authorised branch.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentification9.mmObject();
		}
	};
	protected FinancialInstitutionIdentificationList1 centralisedBranchIdentifiers;
	/**
	 * Identifier of the centralised branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentificationList1
	 * FinancialInstitutionIdentificationList1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice
	 * CentralisedAndAuthorisedBranchIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrldBrnchIdrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralisedBranchIdentifiers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the centralised branch."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCentralisedBranchIdentifiers = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CentralisedAndAuthorisedBranchIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "CntrldBrnchIdrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralisedBranchIdentifiers";
			definition = "Identifier of the centralised branch.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstitutionIdentificationList1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice.mmAuthorisedBranchIdentifier,
						com.tools20022.repository.choice.CentralisedAndAuthorisedBranchIdentification1Choice.mmCentralisedBranchIdentifiers);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CentralisedAndAuthorisedBranchIdentification1Choice";
				definition = "Identifiers for the central and authorised branches.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstitutionIdentification9 getAuthorisedBranchIdentifier() {
		return authorisedBranchIdentifier;
	}

	public void setAuthorisedBranchIdentifier(FinancialInstitutionIdentification9 authorisedBranchIdentifier) {
		this.authorisedBranchIdentifier = authorisedBranchIdentifier;
	}

	public FinancialInstitutionIdentificationList1 getCentralisedBranchIdentifiers() {
		return centralisedBranchIdentifiers;
	}

	public void setCentralisedBranchIdentifiers(FinancialInstitutionIdentificationList1 centralisedBranchIdentifiers) {
		this.centralisedBranchIdentifiers = centralisedBranchIdentifiers;
	}
}