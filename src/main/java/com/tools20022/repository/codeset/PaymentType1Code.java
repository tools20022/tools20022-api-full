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
import com.tools20022.repository.codeset.PaymentType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#CrossBorderPayment
 * PaymentType1Code.CrossBorderPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PaymentType1Code#BackUp
 * PaymentType1Code.BackUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#CLSPayment
 * PaymentType1Code.CLSPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#CentralBankOperation
 * PaymentType1Code.CentralBankOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#CrossBorderHighValuePayment
 * PaymentType1Code.CrossBorderHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#CrossBorderPriorityPayment
 * PaymentType1Code.CrossBorderPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#ExpressPayment
 * PaymentType1Code.ExpressPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#ThirdCurrencyHighValuePayment
 * PaymentType1Code.ThirdCurrencyHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#LiquidityTransfer
 * PaymentType1Code.LiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#DomesticPriorityPayment
 * PaymentType1Code.DomesticPriorityPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#DomesticHighValuePayment
 * PaymentType1Code.DomesticHighValuePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#DomesticPayment
 * PaymentType1Code.DomesticPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#ThirdCurrencyPayment
 * PaymentType1Code.ThirdCurrencyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code#ThirdCurrencyPriorityPayment
 * PaymentType1Code.ThirdCurrencyPriorityPayment}</li>
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
 * "PaymentType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type, or nature, of the payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code CrossBorderPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUp"</li>
	 * </ul>
	 */
	public static final PaymentType1Code BackUp = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUp";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.BackUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CLSPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code CLSPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CLSPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.CLSPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankOperation"</li>
	 * </ul>
	 */
	public static final PaymentType1Code CentralBankOperation = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.CentralBankOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code CrossBorderHighValuePayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossBorderPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code CrossBorderPriorityPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossBorderPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.CrossBorderPriorityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpressPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code ExpressPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpressPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.ExpressPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code ThirdCurrencyHighValuePayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * </ul>
	 */
	public static final PaymentType1Code LiquidityTransfer = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.LiquidityTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code DomesticPriorityPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.DomesticPriorityPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticHighValuePayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code DomesticHighValuePayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticHighValuePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.DomesticHighValuePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomesticPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code DomesticPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DomesticPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.DomesticPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code ThirdCurrencyPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType1Code
	 * PaymentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdCurrencyPriorityPayment"</li>
	 * </ul>
	 */
	public static final PaymentType1Code ThirdCurrencyPriorityPayment = new PaymentType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdCurrencyPriorityPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentType1Code.mmObject();
			codeName = PaymentTypeCode.ThirdCurrencyPriorityPayment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentType1Code> codesByName = new LinkedHashMap<>();

	protected PaymentType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CBS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentType1Code";
				definition = "Specifies the type, or nature, of the payment.";
				trace_lazy = () -> PaymentTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentType1Code.CrossBorderPayment, com.tools20022.repository.codeset.PaymentType1Code.BackUp,
						com.tools20022.repository.codeset.PaymentType1Code.CLSPayment, com.tools20022.repository.codeset.PaymentType1Code.CentralBankOperation, com.tools20022.repository.codeset.PaymentType1Code.CrossBorderHighValuePayment,
						com.tools20022.repository.codeset.PaymentType1Code.CrossBorderPriorityPayment, com.tools20022.repository.codeset.PaymentType1Code.ExpressPayment,
						com.tools20022.repository.codeset.PaymentType1Code.ThirdCurrencyHighValuePayment, com.tools20022.repository.codeset.PaymentType1Code.LiquidityTransfer,
						com.tools20022.repository.codeset.PaymentType1Code.DomesticPriorityPayment, com.tools20022.repository.codeset.PaymentType1Code.DomesticHighValuePayment,
						com.tools20022.repository.codeset.PaymentType1Code.DomesticPayment, com.tools20022.repository.codeset.PaymentType1Code.ThirdCurrencyPayment,
						com.tools20022.repository.codeset.PaymentType1Code.ThirdCurrencyPriorityPayment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CrossBorderPayment.getCodeName().get(), CrossBorderPayment);
		codesByName.put(BackUp.getCodeName().get(), BackUp);
		codesByName.put(CLSPayment.getCodeName().get(), CLSPayment);
		codesByName.put(CentralBankOperation.getCodeName().get(), CentralBankOperation);
		codesByName.put(CrossBorderHighValuePayment.getCodeName().get(), CrossBorderHighValuePayment);
		codesByName.put(CrossBorderPriorityPayment.getCodeName().get(), CrossBorderPriorityPayment);
		codesByName.put(ExpressPayment.getCodeName().get(), ExpressPayment);
		codesByName.put(ThirdCurrencyHighValuePayment.getCodeName().get(), ThirdCurrencyHighValuePayment);
		codesByName.put(LiquidityTransfer.getCodeName().get(), LiquidityTransfer);
		codesByName.put(DomesticPriorityPayment.getCodeName().get(), DomesticPriorityPayment);
		codesByName.put(DomesticHighValuePayment.getCodeName().get(), DomesticHighValuePayment);
		codesByName.put(DomesticPayment.getCodeName().get(), DomesticPayment);
		codesByName.put(ThirdCurrencyPayment.getCodeName().get(), ThirdCurrencyPayment);
		codesByName.put(ThirdCurrencyPriorityPayment.getCodeName().get(), ThirdCurrencyPriorityPayment);
	}

	public static PaymentType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentType1Code[] values() {
		PaymentType1Code[] values = new PaymentType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentType1Code> {
		@Override
		public PaymentType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}