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
import com.tools20022.repository.codeset.ChargeType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies charges linked to the conveyance of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#SignatureService
 * ChargeType8Code.SignatureService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#StorageAtDestination
 * ChargeType8Code.StorageAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#StorageAtOrigin
 * ChargeType8Code.StorageAtOrigin}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType8Code#Packaging
 * ChargeType8Code.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType8Code#PickUp
 * ChargeType8Code.PickUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#DangerousGoodsFee
 * ChargeType8Code.DangerousGoodsFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#SecurityCharge
 * ChargeType8Code.SecurityCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#InsurancePremium
 * ChargeType8Code.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#CollectFreight
 * ChargeType8Code.CollectFreight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#ClearanceAndHandlingAtOrigin
 * ChargeType8Code.ClearanceAndHandlingAtOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#ClearanceAndHandlingAtDestination
 * ChargeType8Code.ClearanceAndHandlingAtDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#AirWayBillFee
 * ChargeType8Code.AirWayBillFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code#TransportCharges
 * ChargeType8Code.TransportCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode ChargeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SIGN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies charges linked to the conveyance of goods."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureService"</li>
	 * </ul>
	 */
	public static final ChargeType8Code SignatureService = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureService";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.SignatureService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageAtDestination"</li>
	 * </ul>
	 */
	public static final ChargeType8Code StorageAtDestination = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StorageAtDestination";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.StorageAtDestination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StorageAtOrigin"</li>
	 * </ul>
	 */
	public static final ChargeType8Code StorageAtOrigin = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StorageAtOrigin";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.StorageAtOrigin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * </ul>
	 */
	public static final ChargeType8Code Packaging = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Packaging";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.Packaging.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUp"</li>
	 * </ul>
	 */
	public static final ChargeType8Code PickUp = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUp";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.PickUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DangerousGoodsFee"</li>
	 * </ul>
	 */
	public static final ChargeType8Code DangerousGoodsFee = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DangerousGoodsFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.DangerousGoodsFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCharge"</li>
	 * </ul>
	 */
	public static final ChargeType8Code SecurityCharge = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.SecurityCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * </ul>
	 */
	public static final ChargeType8Code InsurancePremium = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremium";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.InsurancePremium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectFreight"</li>
	 * </ul>
	 */
	public static final ChargeType8Code CollectFreight = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollectFreight";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.CollectFreight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearanceAndHandlingAtOrigin"</li>
	 * </ul>
	 */
	public static final ChargeType8Code ClearanceAndHandlingAtOrigin = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearanceAndHandlingAtOrigin";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.ClearanceAndHandlingAtOrigin.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearanceAndHandlingAtDestination"</li>
	 * </ul>
	 */
	public static final ChargeType8Code ClearanceAndHandlingAtDestination = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearanceAndHandlingAtDestination";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.ClearanceAndHandlingAtDestination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirWayBillFee"</li>
	 * </ul>
	 */
	public static final ChargeType8Code AirWayBillFee = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirWayBillFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.AirWayBillFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType8Code
	 * ChargeType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * </ul>
	 */
	public static final ChargeType8Code TransportCharges = new ChargeType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportCharges";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType8Code.mmObject();
			codeName = ChargeTypeCode.TransportCharges.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType8Code> codesByName = new LinkedHashMap<>();

	protected ChargeType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SIGN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType8Code";
				definition = "Identifies charges linked to the conveyance of goods.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType8Code.SignatureService, com.tools20022.repository.codeset.ChargeType8Code.StorageAtDestination,
						com.tools20022.repository.codeset.ChargeType8Code.StorageAtOrigin, com.tools20022.repository.codeset.ChargeType8Code.Packaging, com.tools20022.repository.codeset.ChargeType8Code.PickUp,
						com.tools20022.repository.codeset.ChargeType8Code.DangerousGoodsFee, com.tools20022.repository.codeset.ChargeType8Code.SecurityCharge, com.tools20022.repository.codeset.ChargeType8Code.InsurancePremium,
						com.tools20022.repository.codeset.ChargeType8Code.CollectFreight, com.tools20022.repository.codeset.ChargeType8Code.ClearanceAndHandlingAtOrigin,
						com.tools20022.repository.codeset.ChargeType8Code.ClearanceAndHandlingAtDestination, com.tools20022.repository.codeset.ChargeType8Code.AirWayBillFee,
						com.tools20022.repository.codeset.ChargeType8Code.TransportCharges);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SignatureService.getCodeName().get(), SignatureService);
		codesByName.put(StorageAtDestination.getCodeName().get(), StorageAtDestination);
		codesByName.put(StorageAtOrigin.getCodeName().get(), StorageAtOrigin);
		codesByName.put(Packaging.getCodeName().get(), Packaging);
		codesByName.put(PickUp.getCodeName().get(), PickUp);
		codesByName.put(DangerousGoodsFee.getCodeName().get(), DangerousGoodsFee);
		codesByName.put(SecurityCharge.getCodeName().get(), SecurityCharge);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(CollectFreight.getCodeName().get(), CollectFreight);
		codesByName.put(ClearanceAndHandlingAtOrigin.getCodeName().get(), ClearanceAndHandlingAtOrigin);
		codesByName.put(ClearanceAndHandlingAtDestination.getCodeName().get(), ClearanceAndHandlingAtDestination);
		codesByName.put(AirWayBillFee.getCodeName().get(), AirWayBillFee);
		codesByName.put(TransportCharges.getCodeName().get(), TransportCharges);
	}

	public static ChargeType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType8Code[] values() {
		ChargeType8Code[] values = new ChargeType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType8Code> {
		@Override
		public ChargeType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}