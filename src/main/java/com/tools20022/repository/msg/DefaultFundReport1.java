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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.secl.DefaultFundContributionReportV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection21;
import com.tools20022.repository.msg.Collateral3;
import com.tools20022.repository.msg.DefaultFund1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the calculation of the default fund and the collateral
 * that has been posted by the clearing member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#mmDefaultFundCalculation
 * DefaultFundReport1.mmDefaultFundCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#mmCollateralDescription
 * DefaultFundReport1.mmCollateralDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#mmNetExcessOrDeficit
 * DefaultFundReport1.mmNetExcessOrDeficit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmReportDetails
 * DefaultFundContributionReportV02.mmReportDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DefaultFundReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the calculation of the default fund and the collateral that has been posted by the clearing member."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefaultFundReport1", propOrder = {"defaultFundCalculation", "collateralDescription", "netExcessOrDeficit"})
public class DefaultFundReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DfltFndClctn", required = true)
	protected List<DefaultFund1> defaultFundCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DefaultFund1
	 * DefaultFund1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1
	 * DefaultFundReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltFndClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultFundCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the calculation of the clearing member contribution to the default fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultFundReport1, List<DefaultFund1>> mmDefaultFundCalculation = new MMMessageAssociationEnd<DefaultFundReport1, List<DefaultFund1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "DfltFndClctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundCalculation";
			definition = "Provides details about the calculation of the clearing member contribution to the default fund.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DefaultFund1.mmObject();
		}

		@Override
		public List<DefaultFund1> getValue(DefaultFundReport1 obj) {
			return obj.getDefaultFundCalculation();
		}

		@Override
		public void setValue(DefaultFundReport1 obj, List<DefaultFund1> value) {
			obj.setDefaultFundCalculation(value);
		}
	};
	@XmlElement(name = "CollDesc", required = true)
	protected List<Collateral3> collateralDescription;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral3
	 * Collateral3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1
	 * DefaultFundReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the collateral held."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultFundReport1, List<Collateral3>> mmCollateralDescription = new MMMessageAssociationEnd<DefaultFundReport1, List<Collateral3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "CollDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Provides details about the collateral held.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Collateral3.mmObject();
		}

		@Override
		public List<Collateral3> getValue(DefaultFundReport1 obj) {
			return obj.getCollateralDescription();
		}

		@Override
		public void setValue(DefaultFundReport1 obj, List<Collateral3> value) {
			obj.setCollateralDescription(value);
		}
	};
	@XmlElement(name = "NetXcssOrDfcit", required = true)
	protected AmountAndDirection21 netExcessOrDeficit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1
	 * DefaultFundReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetXcssOrDfcit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetExcessOrDeficit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Excess amount that the central counterparty will restitute to the clearing member or deficit to be provided by the member for the guarantee fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DefaultFundReport1, AmountAndDirection21> mmNetExcessOrDeficit = new MMMessageAssociationEnd<DefaultFundReport1, AmountAndDirection21>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "NetXcssOrDfcit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetExcessOrDeficit";
			definition = "Excess amount that the central counterparty will restitute to the clearing member or deficit to be provided by the member for the guarantee fund.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection21.mmObject();
		}

		@Override
		public AmountAndDirection21 getValue(DefaultFundReport1 obj) {
			return obj.getNetExcessOrDeficit();
		}

		@Override
		public void setValue(DefaultFundReport1 obj, AmountAndDirection21 value) {
			obj.setNetExcessOrDeficit(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DefaultFundReport1.mmDefaultFundCalculation, com.tools20022.repository.msg.DefaultFundReport1.mmCollateralDescription,
						com.tools20022.repository.msg.DefaultFundReport1.mmNetExcessOrDeficit);
				messageBuildingBlock_lazy = () -> Arrays.asList(DefaultFundContributionReportV02.mmReportDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultFundReport1";
				definition = "Provides details on the calculation of the default fund and the collateral that has been posted by the clearing member.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<DefaultFund1> getDefaultFundCalculation() {
		return defaultFundCalculation == null ? defaultFundCalculation = new ArrayList<>() : defaultFundCalculation;
	}

	public DefaultFundReport1 setDefaultFundCalculation(List<DefaultFund1> defaultFundCalculation) {
		this.defaultFundCalculation = Objects.requireNonNull(defaultFundCalculation);
		return this;
	}

	public List<Collateral3> getCollateralDescription() {
		return collateralDescription == null ? collateralDescription = new ArrayList<>() : collateralDescription;
	}

	public DefaultFundReport1 setCollateralDescription(List<Collateral3> collateralDescription) {
		this.collateralDescription = Objects.requireNonNull(collateralDescription);
		return this;
	}

	public AmountAndDirection21 getNetExcessOrDeficit() {
		return netExcessOrDeficit;
	}

	public DefaultFundReport1 setNetExcessOrDeficit(AmountAndDirection21 netExcessOrDeficit) {
		this.netExcessOrDeficit = Objects.requireNonNull(netExcessOrDeficit);
		return this;
	}
}