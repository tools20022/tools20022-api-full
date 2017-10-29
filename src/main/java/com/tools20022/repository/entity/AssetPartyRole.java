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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies roles played by a party that are linked to the handling of assets
 * but not related to a specific process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetPartyRole" src="doc-files/AssetPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole#Asset
 * AssetPartyRole.Asset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetPartyRole
 * Asset.AssetPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IssuerRole IssuerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.WarrantAgent WarrantAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioManagerRole
 * PortfolioManagerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAdvisor
 * InvestmentAdvisor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
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
 * "AssetPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies roles played by a party that are linked to the handling of assets but not related to a specific process."
 * </li>
 * </ul>
 */
public class AssetPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the asset for which the party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#AssetPartyRole
	 * Asset.AssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetPartyRole
	 * AssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the asset for which the party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Specifies the asset for which the party plays a role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetPartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetPartyRole";
				definition = "Specifies roles played by a party that are linked to the handling of assets but not related to a specific process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetPartyRole);
				subType_lazy = () -> Arrays.asList(SecuritiesPartyRole.mmObject(), IssuerRole.mmObject(), WarrantAgent.mmObject(), PortfolioManagerRole.mmObject(), InvestmentAdvisor.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetPartyRole.Asset);
			}
		});
		return mmObject_lazy.get();
	}
}