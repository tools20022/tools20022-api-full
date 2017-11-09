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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.SecuritiesTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Transfer of securities from one sub-balance to another or from one balance
 * status to another.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IntraPositionTransfer"
 * src="doc-files/IntraPositionTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails2
 * IntraPositionDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails8
 * IntraPositionDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails12
 * IntraPositionDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails13
 * IntraPositionDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails22
 * IntraPositionDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails26
 * IntraPositionDetails26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails27
 * IntraPositionDetails27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails29
 * IntraPositionDetails29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails1
 * IntraPositionMovementDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails3
 * IntraPositionDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails2
 * IntraPositionMovementDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails6
 * IntraPositionDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5
 * IntraPositionMovementDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails17
 * IntraPositionDetails17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6
 * IntraPositionMovementDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails18
 * IntraPositionDetails18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7
 * IntraPositionMovementDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails20
 * IntraPositionDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8
 * IntraPositionMovementDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails24
 * IntraPositionDetails24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9
 * IntraPositionMovementDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails28
 * IntraPositionDetails28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10
 * IntraPositionMovementDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails30
 * IntraPositionDetails30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails1
 * IntraPositionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails11
 * IntraPositionDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails4
 * IntraPositionDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails9
 * IntraPositionDetails9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails7
 * IntraPositionDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails16
 * IntraPositionDetails16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails21
 * IntraPositionDetails21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails25
 * IntraPositionDetails25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails5
 * IntraPositionDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails15
 * IntraPositionDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails19
 * IntraPositionDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails23
 * IntraPositionDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3
 * IntraPositionMovementDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails10
 * IntraPositionDetails10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4
 * IntraPositionMovementDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails14
 * IntraPositionDetails14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition2
 * IntraBalanceQueryDefinition2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovement2
 * IntraPositionMovement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovement1
 * IntraPositionMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovements1
 * IntraPositionMovements1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1
 * IntraPositionQueryCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
 * IntraBalanceQueryCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition1
 * IntraBalanceQueryDefinition1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition3
 * IntraBalanceQueryDefinition3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPosition4 IntraPosition4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionModification2
 * IntraPositionModification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionModification1
 * IntraPositionModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionCancellation2
 * IntraPositionCancellation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionCancellation1
 * IntraPositionCancellation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails31
 * IntraPositionDetails31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails33
 * IntraPositionDetails33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails34
 * IntraPositionDetails34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails32
 * IntraPositionDetails32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11
 * IntraPositionMovementDetails11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails35
 * IntraPositionDetails35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails36
 * IntraPositionDetails36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails38
 * IntraPositionDetails38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12
 * IntraPositionMovementDetails12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails37
 * IntraPositionDetails37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails41
 * IntraPositionDetails41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails39
 * IntraPositionDetails39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails40
 * IntraPositionDetails40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13
 * IntraPositionMovementDetails13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails43
 * IntraPositionDetails43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails42
 * IntraPositionDetails42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails44
 * IntraPositionDetails44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14
 * IntraPositionMovementDetails14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
 * Reservation.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmIntraPositionMovement
 * IntraPositionDetails3.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6#mmIntraPositionMovement
 * IntraPositionDetails6.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17#mmIntraPositionMovement
 * IntraPositionDetails17.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18#mmIntraPositionMovement
 * IntraPositionDetails18.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20#mmIntraPositionMovement
 * IntraPositionDetails20.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24#mmIntraPositionMovement
 * IntraPositionDetails24.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28#mmIntraPositionMovement
 * IntraPositionDetails28.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30#mmIntraPositionMovement
 * IntraPositionDetails30.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10#mmIntraPositionMovement
 * IntraPositionDetails10.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14#mmIntraPositionMovement
 * IntraPositionDetails14.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition2#mmSearchCriteria
 * IntraBalanceQueryDefinition2.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1#mmMovement
 * IntraPositionMovements1.mmMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition1#mmSearchCriteria
 * IntraBalanceQueryDefinition1.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryDefinition3#mmSearchCriteria
 * IntraBalanceQueryDefinition3.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#mmModification
 * IntraPositionModification1.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#mmCancellation
 * IntraPositionCancellation1.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmIntraPositionMovement
 * IntraPositionDetails32.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37#mmIntraPositionMovement
 * IntraPositionDetails37.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmIntraPositionMovement
 * IntraPositionDetails40.mmIntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44#mmIntraPositionMovement
 * IntraPositionDetails44.mmIntraPositionMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
 * IntraPositionTransfer.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmCollateralAmount
 * IntraPositionTransfer.mmCollateralAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmSecuritiesBalance
 * IntraPositionTransfer.mmSecuritiesBalance}</li>
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
 * "IntraPositionTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer of securities from one sub-balance to another or from one balance status to another."
 * </li>
 * </ul>
 */
public class IntraPositionTransfer extends SecuritiesTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Reservation> reservation;
	/**
	 * Quantity of securities set aside by a party for specific purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
	 * Reservation.mmRelatedIntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reservation
	 * Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of securities set aside by a party for specific purpose."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReservation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reservation";
			definition = "Quantity of securities set aside by a party for specific purpose.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Reservation.mmRelatedIntraPositionTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reservation.mmObject();
		}
	};
	protected CurrencyAndAmount collateralAmount;
	/**
	 * Value of the collateral available for the delivery settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails12#mmCollateralMonitorAmount
	 * IntraPositionDetails12.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails13#mmCollateralMonitorAmount
	 * IntraPositionDetails13.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails22#mmCollateralMonitorAmount
	 * IntraPositionDetails22.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails26#mmCollateralMonitorAmount
	 * IntraPositionDetails26.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmCollateralMonitorAmount
	 * IntraPositionDetails27.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails29#mmCollateralMonitorAmount
	 * IntraPositionDetails29.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails5#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails5.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails6#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails6.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails7#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails7.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails8#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails8.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails9#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails9.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails10#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails10.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails3#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails3.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails4#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails4.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmCollateralMonitorAmount
	 * IntraPositionDetails34.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails11#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails11.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails35#mmCollateralMonitorAmount
	 * IntraPositionDetails35.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails12#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails12.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCollateralMonitorAmount
	 * IntraPositionDetails41.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails13#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails13.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails43#mmCollateralMonitorAmount
	 * IntraPositionDetails43.mmCollateralMonitorAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovementDetails14#mmCollateralMonitorAmount
	 * IntraPositionMovementDetails14.mmCollateralMonitorAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral available for the delivery settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(IntraPositionDetails12.mmCollateralMonitorAmount, IntraPositionDetails13.mmCollateralMonitorAmount, IntraPositionDetails22.mmCollateralMonitorAmount,
					IntraPositionDetails26.mmCollateralMonitorAmount, IntraPositionDetails27.mmCollateralMonitorAmount, IntraPositionDetails29.mmCollateralMonitorAmount, IntraPositionMovementDetails5.mmCollateralMonitorAmount,
					IntraPositionMovementDetails6.mmCollateralMonitorAmount, IntraPositionMovementDetails7.mmCollateralMonitorAmount, IntraPositionMovementDetails8.mmCollateralMonitorAmount,
					IntraPositionMovementDetails9.mmCollateralMonitorAmount, IntraPositionMovementDetails10.mmCollateralMonitorAmount, IntraPositionMovementDetails3.mmCollateralMonitorAmount,
					IntraPositionMovementDetails4.mmCollateralMonitorAmount, IntraPositionDetails34.mmCollateralMonitorAmount, IntraPositionMovementDetails11.mmCollateralMonitorAmount, IntraPositionDetails35.mmCollateralMonitorAmount,
					IntraPositionMovementDetails12.mmCollateralMonitorAmount, IntraPositionDetails41.mmCollateralMonitorAmount, IntraPositionMovementDetails13.mmCollateralMonitorAmount, IntraPositionDetails43.mmCollateralMonitorAmount,
					IntraPositionMovementDetails14.mmCollateralMonitorAmount);
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral available for the delivery settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * Specifies the securities balance or sub-balance from/to which the
	 * securities are transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmRelatedIntraPositionTransfer
	 * SecuritiesBalance.mmRelatedIntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmBalanceType
	 * IntraPositionQueryCriteria1.mmBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPosition4#mmBalanceFrom
	 * IntraPosition4.mmBalanceFrom}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.IntraPosition4#mmBalanceTo
	 * IntraPosition4.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities balance or sub-balance from/to which the securities are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IntraPositionQueryCriteria1.mmBalanceType, IntraPosition4.mmBalanceFrom, IntraPosition4.mmBalanceTo);
			elementContext_lazy = () -> IntraPositionTransfer.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies the securities balance or sub-balance from/to which the securities are transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionTransfer";
				definition = "Transfer of securities from one sub-balance to another or from one balance status to another.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.mmRelatedIntraPositionTransfer, com.tools20022.repository.entity.SecuritiesBalance.mmRelatedIntraPositionTransfer);
				derivationElement_lazy = () -> Arrays.asList(IntraPositionDetails3.mmIntraPositionMovement, IntraPositionDetails6.mmIntraPositionMovement, IntraPositionDetails17.mmIntraPositionMovement,
						IntraPositionDetails18.mmIntraPositionMovement, IntraPositionDetails20.mmIntraPositionMovement, IntraPositionDetails24.mmIntraPositionMovement, IntraPositionDetails28.mmIntraPositionMovement,
						IntraPositionDetails30.mmIntraPositionMovement, IntraPositionDetails10.mmIntraPositionMovement, IntraPositionDetails14.mmIntraPositionMovement, IntraBalanceQueryDefinition2.mmSearchCriteria,
						IntraPositionMovements1.mmMovement, IntraBalanceQueryDefinition1.mmSearchCriteria, IntraBalanceQueryDefinition3.mmSearchCriteria, IntraPositionModification1.mmModification, IntraPositionCancellation1.mmCancellation,
						IntraPositionDetails32.mmIntraPositionMovement, IntraPositionDetails37.mmIntraPositionMovement, IntraPositionDetails40.mmIntraPositionMovement, IntraPositionDetails44.mmIntraPositionMovement);
				superType_lazy = () -> SecuritiesTransfer.mmObject();
				element_lazy = () -> Arrays.asList(IntraPositionTransfer.mmReservation, IntraPositionTransfer.mmCollateralAmount, IntraPositionTransfer.mmSecuritiesBalance);
				derivationComponent_lazy = () -> Arrays.asList(IntraPositionDetails2.mmObject(), IntraPositionDetails8.mmObject(), IntraPositionDetails12.mmObject(), IntraPositionDetails13.mmObject(), IntraPositionDetails22.mmObject(),
						IntraPositionDetails26.mmObject(), IntraPositionDetails27.mmObject(), IntraPositionDetails29.mmObject(), IntraPositionMovementDetails1.mmObject(), IntraPositionDetails3.mmObject(),
						IntraPositionMovementDetails2.mmObject(), IntraPositionDetails6.mmObject(), IntraPositionMovementDetails5.mmObject(), IntraPositionDetails17.mmObject(), IntraPositionMovementDetails6.mmObject(),
						IntraPositionDetails18.mmObject(), IntraPositionMovementDetails7.mmObject(), IntraPositionDetails20.mmObject(), IntraPositionMovementDetails8.mmObject(), IntraPositionDetails24.mmObject(),
						IntraPositionMovementDetails9.mmObject(), IntraPositionDetails28.mmObject(), IntraPositionMovementDetails10.mmObject(), IntraPositionDetails30.mmObject(), IntraPositionDetails1.mmObject(),
						IntraPositionDetails11.mmObject(), IntraPositionDetails4.mmObject(), IntraPositionDetails9.mmObject(), IntraPositionDetails7.mmObject(), IntraPositionDetails16.mmObject(), IntraPositionDetails21.mmObject(),
						IntraPositionDetails25.mmObject(), IntraPositionDetails5.mmObject(), IntraPositionDetails15.mmObject(), IntraPositionDetails19.mmObject(), IntraPositionDetails23.mmObject(), IntraPositionMovementDetails3.mmObject(),
						IntraPositionDetails10.mmObject(), IntraPositionMovementDetails4.mmObject(), IntraPositionDetails14.mmObject(), IntraBalanceQueryDefinition2.mmObject(), IntraPositionMovement2.mmObject(),
						IntraPositionMovement1.mmObject(), IntraPositionMovements1.mmObject(), IntraPositionQueryCriteria1.mmObject(), IntraBalanceQueryCriteria1.mmObject(), IntraBalanceQueryDefinition1.mmObject(),
						IntraBalanceQueryDefinition3.mmObject(), IntraPosition4.mmObject(), IntraPositionModification2.mmObject(), IntraPositionModification1.mmObject(), IntraPositionCancellation2.mmObject(),
						IntraPositionCancellation1.mmObject(), IntraPositionDetails31.mmObject(), IntraPositionDetails33.mmObject(), IntraPositionDetails34.mmObject(), IntraPositionDetails32.mmObject(),
						IntraPositionMovementDetails11.mmObject(), IntraPositionDetails35.mmObject(), IntraPositionDetails36.mmObject(), IntraPositionDetails38.mmObject(), IntraPositionMovementDetails12.mmObject(),
						IntraPositionDetails37.mmObject(), IntraPositionDetails41.mmObject(), IntraPositionDetails39.mmObject(), IntraPositionDetails40.mmObject(), IntraPositionMovementDetails13.mmObject(),
						IntraPositionDetails43.mmObject(), IntraPositionDetails42.mmObject(), IntraPositionDetails44.mmObject(), IntraPositionMovementDetails14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<com.tools20022.repository.entity.Reservation> reservation) {
		this.reservation = reservation;
	}

	public CurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public void setCollateralAmount(CurrencyAndAmount collateralAmount) {
		this.collateralAmount = collateralAmount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}
}