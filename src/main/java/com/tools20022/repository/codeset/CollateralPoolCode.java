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
import com.tools20022.repository.codeset.CollateralPoolCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the collateral is a pool collateral, delivery by value
 * specific pool or not a pool.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralPoolCode#Pool
 * CollateralPoolCode.Pool}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralPoolCode#NoPool
 * CollateralPoolCode.NoPool}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CollateralPoolCode#DeliveryByValuePool
 * CollateralPoolCode.DeliveryByValuePool}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CollateralPool1Code
 * CollateralPool1Code}</li>
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
 * "CollateralPoolCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the collateral is a pool collateral, delivery by value specific pool or not a pool."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CollateralPoolCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collateral is of pool type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPoolCode
	 * CollateralPoolCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral is of pool type."</li>
	 * </ul>
	 */
	public static final CollateralPoolCode Pool = new CollateralPoolCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pool";
			definition = "Collateral is of pool type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralPoolCode.mmObject();
			codeName = "POOL";
		}
	};
	/**
	 * Collateral is not of pool type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPoolCode
	 * CollateralPoolCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral is not of pool type."</li>
	 * </ul>
	 */
	public static final CollateralPoolCode NoPool = new CollateralPoolCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPool";
			definition = "Collateral is not of pool type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralPoolCode.mmObject();
			codeName = "NOPL";
		}
	};
	/**
	 * Transaction was settled using a delivery by value mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPoolCode
	 * CollateralPoolCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryByValuePool"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction was settled using a delivery by value mechanism."</li>
	 * </ul>
	 */
	public static final CollateralPoolCode DeliveryByValuePool = new CollateralPoolCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryByValuePool";
			definition = "Transaction was settled using a delivery by value mechanism.";
			owner_lazy = () -> com.tools20022.repository.codeset.CollateralPoolCode.mmObject();
			codeName = "DBVP";
		}
	};
	final static private LinkedHashMap<String, CollateralPoolCode> codesByName = new LinkedHashMap<>();

	protected CollateralPoolCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralPoolCode";
				definition = "Specifies whether the collateral is a pool collateral, delivery by value specific pool or not a pool.";
				derivation_lazy = () -> Arrays.asList(CollateralPool1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CollateralPoolCode.Pool, com.tools20022.repository.codeset.CollateralPoolCode.NoPool,
						com.tools20022.repository.codeset.CollateralPoolCode.DeliveryByValuePool);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pool.getCodeName().get(), Pool);
		codesByName.put(NoPool.getCodeName().get(), NoPool);
		codesByName.put(DeliveryByValuePool.getCodeName().get(), DeliveryByValuePool);
	}

	public static CollateralPoolCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CollateralPoolCode[] values() {
		CollateralPoolCode[] values = new CollateralPoolCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CollateralPoolCode> {
		@Override
		public CollateralPoolCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CollateralPoolCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}