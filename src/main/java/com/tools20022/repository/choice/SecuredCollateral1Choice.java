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
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.msg.CollateralValuation3;
import com.tools20022.repository.msg.CollateralValuation4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides the collateral details for the secured markets.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmSingleCollateral
 * SecuredCollateral1Choice.mmSingleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmMultipleCollateral
 * SecuredCollateral1Choice.mmMultipleCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmPoolCollateral
 * SecuredCollateral1Choice.mmPoolCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice#mmOtherCollateral
 * SecuredCollateral1Choice.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
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
 * "SecuredCollateral1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the collateral details for the secured markets."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice
 * SecuredCollateral2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SecuredCollateral1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralValuation3 singleCollateral;
	/**
	 * Identifies the security pledged via a single ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation3
	 * CollateralValuation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice
	 * SecuredCollateral1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnglColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security pledged via a single ISIN."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmSingleCollateral
	 * SecuredCollateral2Choice.mmSingleCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSingleCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral1Choice.mmObject();
			isDerived = false;
			xmlTag = "SnglColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleCollateral";
			definition = "Identifies the security pledged via a single ISIN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral2Choice.mmSingleCollateral);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation3.mmObject();
		}
	};
	protected List<CollateralValuation3> multipleCollateral;
	/**
	 * Identifies all securities pledged when the transaction is collateralised
	 * with more than one security. <br>
	 * Usage:<br>
	 * In case of multi-collateral repo, the nominal amount of each
	 * collateralised security must be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation3
	 * CollateralValuation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice
	 * SecuredCollateral1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies all securities pledged when the transaction is collateralised with more than one security. \r\nUsage:\r\nIn case of multi-collateral repo, the nominal amount of each collateralised security must be provided."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmMultipleCollateral
	 * SecuredCollateral2Choice.mmMultipleCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultipleCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral1Choice.mmObject();
			isDerived = false;
			xmlTag = "MltplColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleCollateral";
			definition = "Identifies all securities pledged when the transaction is collateralised with more than one security. \r\nUsage:\r\nIn case of multi-collateral repo, the nominal amount of each collateralised security must be provided.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral2Choice.mmMultipleCollateral);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation3.mmObject();
		}
	};
	protected CollateralValuation3 poolCollateral;
	/**
	 * Identifies the pooling of repos in which the collateral basket is
	 * identified by an ISIN. <br>
	 * <br>
	 * Usage: When the collateral basket is identified by an ISIN, the basket
	 * ISIN shall be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation3
	 * CollateralValuation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice
	 * SecuredCollateral1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the pooling of repos in which the collateral basket is identified by an ISIN. \r\n\r\nUsage: When the collateral basket is identified by an ISIN, the basket ISIN shall be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmPoolCollateral
	 * SecuredCollateral2Choice.mmPoolCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPoolCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral1Choice.mmObject();
			isDerived = false;
			xmlTag = "PoolColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolCollateral";
			definition = "Identifies the pooling of repos in which the collateral basket is identified by an ISIN. \r\n\r\nUsage: When the collateral basket is identified by an ISIN, the basket ISIN shall be reported.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral2Choice.mmPoolCollateral);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation3.mmObject();
		}
	};
	protected List<CollateralValuation4> otherCollateral;
	/**
	 * Identifies the collateral when the asset class pledged as collateral does
	 * not correspond to an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralValuation4
	 * CollateralValuation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral1Choice
	 * SecuredCollateral1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the collateral when the asset class pledged as collateral does not correspond to an ISIN."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuredCollateral2Choice#mmOtherCollateral
	 * SecuredCollateral2Choice.mmOtherCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralValuation.mmObject();
			componentContext_lazy = () -> SecuredCollateral1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Identifies the collateral when the asset class pledged as collateral does not correspond to an ISIN.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral2Choice.mmOtherCollateral);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralValuation4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuredCollateral1Choice.mmSingleCollateral, com.tools20022.repository.choice.SecuredCollateral1Choice.mmMultipleCollateral,
						com.tools20022.repository.choice.SecuredCollateral1Choice.mmPoolCollateral, com.tools20022.repository.choice.SecuredCollateral1Choice.mmOtherCollateral);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuredCollateral1Choice";
				definition = "Provides the collateral details for the secured markets.";
				nextVersions_lazy = () -> Arrays.asList(SecuredCollateral2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralValuation3 getSingleCollateral() {
		return singleCollateral;
	}

	public void setSingleCollateral(CollateralValuation3 singleCollateral) {
		this.singleCollateral = singleCollateral;
	}

	public List<CollateralValuation3> getMultipleCollateral() {
		return multipleCollateral;
	}

	public void setMultipleCollateral(List<CollateralValuation3> multipleCollateral) {
		this.multipleCollateral = multipleCollateral;
	}

	public CollateralValuation3 getPoolCollateral() {
		return poolCollateral;
	}

	public void setPoolCollateral(CollateralValuation3 poolCollateral) {
		this.poolCollateral = poolCollateral;
	}

	public List<CollateralValuation4> getOtherCollateral() {
		return otherCollateral;
	}

	public void setOtherCollateral(List<CollateralValuation4> otherCollateral) {
		this.otherCollateral = otherCollateral;
	}
}