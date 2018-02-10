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
import com.tools20022.repository.codeset.CommissionType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service for which the commission is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#ClientDirected
 * CommissionType9Code.ClientDirected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#StepOut
 * CommissionType9Code.StepOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#SoftDollar
 * CommissionType9Code.SoftDollar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#PercentageOfPrincipal
 * CommissionType9Code.PercentageOfPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#FlatFee
 * CommissionType9Code.FlatFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#PerUnit
 * CommissionType9Code.PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#PercentageCommissionWaivedAsCashDiscount
 * CommissionType9Code.PercentageCommissionWaivedAsCashDiscount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#PercentageCommissionWaivedAsAdditionalUnits
 * CommissionType9Code.PercentageCommissionWaivedAsAdditionalUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#BrokerageRate
 * CommissionType9Code.BrokerageRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#DifferentialOrDeferredPayment
 * CommissionType9Code.DifferentialOrDeferredPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code#PointsPerBondOrContract
 * CommissionType9Code.PointsPerBondOrContract}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CommissionTypeV2Code
 * CommissionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CLDI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CommissionType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which the commission is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CommissionType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientDirected"</li>
	 * </ul>
	 */
	public static final CommissionType9Code ClientDirected = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientDirected";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.ClientDirected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StepOut"</li>
	 * </ul>
	 */
	public static final CommissionType9Code StepOut = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StepOut";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.StepOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftDollar"</li>
	 * </ul>
	 */
	public static final CommissionType9Code SoftDollar = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftDollar";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.SoftDollar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPrincipal"</li>
	 * </ul>
	 */
	public static final CommissionType9Code PercentageOfPrincipal = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.PercentageOfPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatFee"</li>
	 * </ul>
	 */
	public static final CommissionType9Code FlatFee = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatFee";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.FlatFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final CommissionType9Code PerUnit = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.PerUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsCashDiscount"</li>
	 * </ul>
	 */
	public static final CommissionType9Code PercentageCommissionWaivedAsCashDiscount = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsCashDiscount";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.PercentageCommissionWaivedAsCashDiscount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageCommissionWaivedAsAdditionalUnits"</li>
	 * </ul>
	 */
	public static final CommissionType9Code PercentageCommissionWaivedAsAdditionalUnits = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageCommissionWaivedAsAdditionalUnits";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.PercentageCommissionWaivedAsAdditionalUnits.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerageRate"</li>
	 * </ul>
	 */
	public static final CommissionType9Code BrokerageRate = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerageRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.BrokerageRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DifferentialOrDeferredPayment"</li>
	 * </ul>
	 */
	public static final CommissionType9Code DifferentialOrDeferredPayment = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DifferentialOrDeferredPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.DifferentialOrDeferredPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CommissionType9Code
	 * CommissionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsPerBondOrContract"</li>
	 * </ul>
	 */
	public static final CommissionType9Code PointsPerBondOrContract = new CommissionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointsPerBondOrContract";
			owner_lazy = () -> com.tools20022.repository.codeset.CommissionType9Code.mmObject();
			codeName = CommissionTypeV2Code.PointsPerBondOrContract.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CommissionType9Code> codesByName = new LinkedHashMap<>();

	protected CommissionType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CLDI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionType9Code";
				definition = "Type of service for which the commission is asked or paid.";
				trace_lazy = () -> CommissionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CommissionType9Code.ClientDirected, com.tools20022.repository.codeset.CommissionType9Code.StepOut,
						com.tools20022.repository.codeset.CommissionType9Code.SoftDollar, com.tools20022.repository.codeset.CommissionType9Code.PercentageOfPrincipal, com.tools20022.repository.codeset.CommissionType9Code.FlatFee,
						com.tools20022.repository.codeset.CommissionType9Code.PerUnit, com.tools20022.repository.codeset.CommissionType9Code.PercentageCommissionWaivedAsCashDiscount,
						com.tools20022.repository.codeset.CommissionType9Code.PercentageCommissionWaivedAsAdditionalUnits, com.tools20022.repository.codeset.CommissionType9Code.BrokerageRate,
						com.tools20022.repository.codeset.CommissionType9Code.DifferentialOrDeferredPayment, com.tools20022.repository.codeset.CommissionType9Code.PointsPerBondOrContract);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClientDirected.getCodeName().get(), ClientDirected);
		codesByName.put(StepOut.getCodeName().get(), StepOut);
		codesByName.put(SoftDollar.getCodeName().get(), SoftDollar);
		codesByName.put(PercentageOfPrincipal.getCodeName().get(), PercentageOfPrincipal);
		codesByName.put(FlatFee.getCodeName().get(), FlatFee);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
		codesByName.put(PercentageCommissionWaivedAsCashDiscount.getCodeName().get(), PercentageCommissionWaivedAsCashDiscount);
		codesByName.put(PercentageCommissionWaivedAsAdditionalUnits.getCodeName().get(), PercentageCommissionWaivedAsAdditionalUnits);
		codesByName.put(BrokerageRate.getCodeName().get(), BrokerageRate);
		codesByName.put(DifferentialOrDeferredPayment.getCodeName().get(), DifferentialOrDeferredPayment);
		codesByName.put(PointsPerBondOrContract.getCodeName().get(), PointsPerBondOrContract);
	}

	public static CommissionType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CommissionType9Code[] values() {
		CommissionType9Code[] values = new CommissionType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CommissionType9Code> {
		@Override
		public CommissionType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CommissionType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}