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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PaymentType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type, or nature, of the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#CrossBorderPayment
 * PaymentType3Code.CrossBorderPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentType3Code#BackUp
 * PaymentType3Code.BackUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#BalanceRetail
 * PaymentType3Code.BalanceRetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#CLSPayment
 * PaymentType3Code.CLSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#CentralBankOperation
 * PaymentType3Code.CentralBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#CrossBorderHighValuePayment
 * PaymentType3Code.CrossBorderHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#CrossBorderPriorityPayment
 * PaymentType3Code.CrossBorderPriorityPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentType3Code#DVPGross
 * PaymentType3Code.DVPGross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentType3Code#DVPNet
 * PaymentType3Code.DVPNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#ExpressPayment
 * PaymentType3Code.ExpressPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#ThirdCurrencyHighValuePayment
 * PaymentType3Code.ThirdCurrencyHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#LimitPayment
 * PaymentType3Code.LimitPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#LiquidityTransfer
 * PaymentType3Code.LiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#DomesticPriorityPayment
 * PaymentType3Code.DomesticPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#DomesticHighValuePayment
 * PaymentType3Code.DomesticHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#DomesticPayment
 * PaymentType3Code.DomesticPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#StandingFacilities
 * PaymentType3Code.StandingFacilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#TreasuryStatePayment
 * PaymentType3Code.TreasuryStatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#ThirdCurrencyPayment
 * PaymentType3Code.ThirdCurrencyPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentType3Code#Loan
 * PaymentType3Code.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#LoanRepayment
 * PaymentType3Code.LoanRepayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#ThirdCurrencyPriorityPayment
 * PaymentType3Code.ThirdCurrencyPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#OvernightDeposit
 * PaymentType3Code.OvernightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code#MarginalLending
 * PaymentType3Code.MarginalLending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentTypeCode
 * PaymentTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CBS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type, or nature, of the payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code CrossBorderPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUp"</li>
	 * </ul>
	 */
	public static final PaymentType3Code BackUp = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUp";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.BackUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRetail"</li>
	 * </ul>
	 */
	public static final PaymentType3Code BalanceRetail = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRetail";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.BalanceRetail.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code CLSPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CLSPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.CLSPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankOperation"</li>
	 * </ul>
	 */
	public static final PaymentType3Code CentralBankOperation = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.CentralBankOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code CrossBorderHighValuePayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code CrossBorderPriorityPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderPriorityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DVPGross"</li>
	 * </ul>
	 */
	public static final PaymentType3Code DVPGross = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DVPGross";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.DVPGross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DVPNet"</li>
	 * </ul>
	 */
	public static final PaymentType3Code DVPNet = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DVPNet";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.DVPNet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpressPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code ExpressPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpressPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.ExpressPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code ThirdCurrencyHighValuePayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code LimitPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.LimitPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * </ul>
	 */
	public static final PaymentType3Code LiquidityTransfer = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.LiquidityTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code DomesticPriorityPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.DomesticPriorityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code DomesticHighValuePayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.DomesticHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code DomesticPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.DomesticPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingFacilities"</li>
	 * </ul>
	 */
	public static final PaymentType3Code StandingFacilities = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingFacilities";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.StandingFacilities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryStatePayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code TreasuryStatePayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryStatePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.TreasuryStatePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code ThirdCurrencyPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * </ul>
	 */
	public static final PaymentType3Code Loan = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LoanRepayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code LoanRepayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LoanRepayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.LoanRepayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType3Code ThirdCurrencyPriorityPayment = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyPriorityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OvernightDeposit"</li>
	 * </ul>
	 */
	public static final PaymentType3Code OvernightDeposit = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OvernightDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.OvernightDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * </ul>
	 */
	public static final PaymentType3Code MarginalLending = new PaymentType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginalLending";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType3Code.mmObject();
			codeName = PaymentTypeCode.MarginalLending.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentType3Code> codesByName = new LinkedHashMap<>();

	protected PaymentType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CBS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentType3Code";
				definition = "Specifies the type, or nature, of the payment.";
				trace_lazy = () -> PaymentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentType3Code.CrossBorderPayment, com.tools20022.repository.codeset.PaymentType3Code.BackUp,
						com.tools20022.repository.codeset.PaymentType3Code.BalanceRetail, com.tools20022.repository.codeset.PaymentType3Code.CLSPayment, com.tools20022.repository.codeset.PaymentType3Code.CentralBankOperation,
						com.tools20022.repository.codeset.PaymentType3Code.CrossBorderHighValuePayment, com.tools20022.repository.codeset.PaymentType3Code.CrossBorderPriorityPayment,
						com.tools20022.repository.codeset.PaymentType3Code.DVPGross, com.tools20022.repository.codeset.PaymentType3Code.DVPNet, com.tools20022.repository.codeset.PaymentType3Code.ExpressPayment,
						com.tools20022.repository.codeset.PaymentType3Code.ThirdCurrencyHighValuePayment, com.tools20022.repository.codeset.PaymentType3Code.LimitPayment,
						com.tools20022.repository.codeset.PaymentType3Code.LiquidityTransfer, com.tools20022.repository.codeset.PaymentType3Code.DomesticPriorityPayment,
						com.tools20022.repository.codeset.PaymentType3Code.DomesticHighValuePayment, com.tools20022.repository.codeset.PaymentType3Code.DomesticPayment, com.tools20022.repository.codeset.PaymentType3Code.StandingFacilities,
						com.tools20022.repository.codeset.PaymentType3Code.TreasuryStatePayment, com.tools20022.repository.codeset.PaymentType3Code.ThirdCurrencyPayment, com.tools20022.repository.codeset.PaymentType3Code.Loan,
						com.tools20022.repository.codeset.PaymentType3Code.LoanRepayment, com.tools20022.repository.codeset.PaymentType3Code.ThirdCurrencyPriorityPayment, com.tools20022.repository.codeset.PaymentType3Code.OvernightDeposit,
						com.tools20022.repository.codeset.PaymentType3Code.MarginalLending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CrossBorderPayment.getCodeName().get(), CrossBorderPayment);
		codesByName.put(BackUp.getCodeName().get(), BackUp);
		codesByName.put(BalanceRetail.getCodeName().get(), BalanceRetail);
		codesByName.put(CLSPayment.getCodeName().get(), CLSPayment);
		codesByName.put(CentralBankOperation.getCodeName().get(), CentralBankOperation);
		codesByName.put(CrossBorderHighValuePayment.getCodeName().get(), CrossBorderHighValuePayment);
		codesByName.put(CrossBorderPriorityPayment.getCodeName().get(), CrossBorderPriorityPayment);
		codesByName.put(DVPGross.getCodeName().get(), DVPGross);
		codesByName.put(DVPNet.getCodeName().get(), DVPNet);
		codesByName.put(ExpressPayment.getCodeName().get(), ExpressPayment);
		codesByName.put(ThirdCurrencyHighValuePayment.getCodeName().get(), ThirdCurrencyHighValuePayment);
		codesByName.put(LimitPayment.getCodeName().get(), LimitPayment);
		codesByName.put(LiquidityTransfer.getCodeName().get(), LiquidityTransfer);
		codesByName.put(DomesticPriorityPayment.getCodeName().get(), DomesticPriorityPayment);
		codesByName.put(DomesticHighValuePayment.getCodeName().get(), DomesticHighValuePayment);
		codesByName.put(DomesticPayment.getCodeName().get(), DomesticPayment);
		codesByName.put(StandingFacilities.getCodeName().get(), StandingFacilities);
		codesByName.put(TreasuryStatePayment.getCodeName().get(), TreasuryStatePayment);
		codesByName.put(ThirdCurrencyPayment.getCodeName().get(), ThirdCurrencyPayment);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(LoanRepayment.getCodeName().get(), LoanRepayment);
		codesByName.put(ThirdCurrencyPriorityPayment.getCodeName().get(), ThirdCurrencyPriorityPayment);
		codesByName.put(OvernightDeposit.getCodeName().get(), OvernightDeposit);
		codesByName.put(MarginalLending.getCodeName().get(), MarginalLending);
	}

	public static PaymentType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentType3Code[] values() {
		PaymentType3Code[] values = new PaymentType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentType3Code> {
		@Override
		public PaymentType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}