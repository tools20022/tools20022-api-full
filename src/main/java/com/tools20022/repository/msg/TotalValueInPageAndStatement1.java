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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Totals for the value of the holdings reported in the statement or page.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalHoldingsValueOfPage
 * TotalValueInPageAndStatement1.mmTotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement1.mmTotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalBookValueOfStatement
 * TotalValueInPageAndStatement1.mmTotalBookValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalEligibleCollateralValue
 * TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV03.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV04.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV06.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV07.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV08.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV09.mmAccountBaseCurrencyTotalAmounts}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalValueInPageAndStatement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TotalValueInPageAndStatement1", propOrder = {"totalHoldingsValueOfPage", "totalHoldingsValueOfStatement", "totalBookValueOfStatement", "totalEligibleCollateralValue"})
public class TotalValueInPageAndStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection6 totalHoldingsValueOfPage;
	/**
	 * Total value of positions reported in this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfPg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfPage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of positions reported in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalHoldingsValueOfPage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfPage";
			definition = "Total value of positions reported in this message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 totalHoldingsValueOfStatement;
	/**
	 * Total value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalHoldingsValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfStatement";
			definition = "Total value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 totalBookValueOfStatement;
	/**
	 * Total book value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total book value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalBookValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueOfStatement";
			definition = "Total book value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 totalEligibleCollateralValue;
	/**
	 * Total value of the holdings eligible for collateral purposes reported in
	 * this statement (a statement may comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
	 * AssetHolding.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblCollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the holdings eligible for collateral purposes reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalEligibleCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmEligibleCollateralValue;
			componentContext_lazy = () -> TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleCollateralValue";
			definition = "Total value of the holdings eligible for collateral purposes reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TotalValueInPageAndStatement1.mmTotalHoldingsValueOfPage, TotalValueInPageAndStatement1.mmTotalHoldingsValueOfStatement, TotalValueInPageAndStatement1.mmTotalBookValueOfStatement,
						TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV03.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV04.mmAccountBaseCurrencyTotalAmounts,
						SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV06.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV07.mmAccountBaseCurrencyTotalAmounts,
						SecuritiesBalanceCustodyReportV08.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV09.mmAccountBaseCurrencyTotalAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement1";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlHldgsValOfPg")
	public AmountAndDirection6 getTotalHoldingsValueOfPage() {
		return totalHoldingsValueOfPage;
	}

	public void setTotalHoldingsValueOfPage(com.tools20022.repository.msg.AmountAndDirection6 totalHoldingsValueOfPage) {
		this.totalHoldingsValueOfPage = totalHoldingsValueOfPage;
	}

	@XmlElement(name = "TtlHldgsValOfStmt", required = true)
	public AmountAndDirection6 getTotalHoldingsValueOfStatement() {
		return totalHoldingsValueOfStatement;
	}

	public void setTotalHoldingsValueOfStatement(com.tools20022.repository.msg.AmountAndDirection6 totalHoldingsValueOfStatement) {
		this.totalHoldingsValueOfStatement = totalHoldingsValueOfStatement;
	}

	@XmlElement(name = "TtlBookValOfStmt")
	public AmountAndDirection6 getTotalBookValueOfStatement() {
		return totalBookValueOfStatement;
	}

	public void setTotalBookValueOfStatement(com.tools20022.repository.msg.AmountAndDirection6 totalBookValueOfStatement) {
		this.totalBookValueOfStatement = totalBookValueOfStatement;
	}

	@XmlElement(name = "TtlElgblCollVal")
	public AmountAndDirection6 getTotalEligibleCollateralValue() {
		return totalEligibleCollateralValue;
	}

	public void setTotalEligibleCollateralValue(com.tools20022.repository.msg.AmountAndDirection6 totalEligibleCollateralValue) {
		this.totalEligibleCollateralValue = totalEligibleCollateralValue;
	}
}