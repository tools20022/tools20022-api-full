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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#DefaultFundCalculation
 * DefaultFundReport1.DefaultFundCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#CollateralDescription
 * DefaultFundReport1.CollateralDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1#NetExcessOrDeficit
 * DefaultFundReport1.NetExcessOrDeficit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#ReportDetails
 * DefaultFundContributionReportV02.ReportDetails}</li>
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
public class DefaultFundReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Provides details about the calculation of the clearing member
	 * contribution to the default fund.
	 * <p>
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
	public static final MMMessageAssociationEnd DefaultFundCalculation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "DfltFndClctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultFundCalculation";
			definition = "Provides details about the calculation of the clearing member contribution to the default fund.";
			minOccurs = 1;
			type_lazy = () -> DefaultFund1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details about the collateral held.
	 * <p>
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
	public static final MMMessageAssociationEnd CollateralDescription = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "CollDesc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralDescription";
			definition = "Provides details about the collateral held.";
			minOccurs = 1;
			type_lazy = () -> Collateral3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Excess amount that the central counterparty will restitute to the
	 * clearing member or deficit to be provided by the member for the guarantee
	 * fund.
	 * <p>
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
	public static final MMMessageAssociationEnd NetExcessOrDeficit = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DefaultFundReport1.mmObject();
			isDerived = false;
			xmlTag = "NetXcssOrDfcit";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetExcessOrDeficit";
			definition = "Excess amount that the central counterparty will restitute to the clearing member or deficit to be provided by the member for the guarantee fund.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection21.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DefaultFundReport1.DefaultFundCalculation, com.tools20022.repository.msg.DefaultFundReport1.CollateralDescription,
						com.tools20022.repository.msg.DefaultFundReport1.NetExcessOrDeficit);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.DefaultFundContributionReportV02.ReportDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DefaultFundReport1";
				definition = "Provides details on the calculation of the default fund and the collateral that has been posted by the clearing member.";
			}
		});
		return mmObject_lazy.get();
	}
}