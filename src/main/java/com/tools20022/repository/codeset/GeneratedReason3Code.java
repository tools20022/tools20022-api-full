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
import com.tools20022.repository.codeset.GeneratedReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the transaction was generated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#CollateralManagement
 * GeneratedReason3Code.CollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#MarketClaim
 * GeneratedReason3Code.MarketClaim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#Other
 * GeneratedReason3Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#ReturnRefusedDumps
 * GeneratedReason3Code.ReturnRefusedDumps}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#SplitShaping
 * GeneratedReason3Code.SplitShaping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#ThirdParty
 * GeneratedReason3Code.ThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code#Transformation
 * GeneratedReason3Code.Transformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GeneratedReasonCode
 * GeneratedReasonCode}</li>
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
 * "GeneratedReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the transaction was generated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GeneratedReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code CollateralManagement = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.CollateralManagement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code MarketClaim = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code Other = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnRefusedDumps"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code ReturnRefusedDumps = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnRefusedDumps";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.ReturnRefusedDumps.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitShaping"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code SplitShaping = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitShaping";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.SplitShaping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdParty"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code ThirdParty = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdParty";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.ThirdParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeneratedReason3Code
	 * GeneratedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transformation"</li>
	 * </ul>
	 */
	public static final GeneratedReason3Code Transformation = new GeneratedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transformation";
			owner_lazy = () -> com.tools20022.repository.codeset.GeneratedReason3Code.mmObject();
			codeName = GeneratedReasonCode.Transformation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GeneratedReason3Code> codesByName = new LinkedHashMap<>();

	protected GeneratedReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeneratedReason3Code";
				definition = "Specifies the reason why the transaction was generated.";
				trace_lazy = () -> GeneratedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GeneratedReason3Code.CollateralManagement, com.tools20022.repository.codeset.GeneratedReason3Code.MarketClaim,
						com.tools20022.repository.codeset.GeneratedReason3Code.Other, com.tools20022.repository.codeset.GeneratedReason3Code.ReturnRefusedDumps, com.tools20022.repository.codeset.GeneratedReason3Code.SplitShaping,
						com.tools20022.repository.codeset.GeneratedReason3Code.ThirdParty, com.tools20022.repository.codeset.GeneratedReason3Code.Transformation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CollateralManagement.getCodeName().get(), CollateralManagement);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReturnRefusedDumps.getCodeName().get(), ReturnRefusedDumps);
		codesByName.put(SplitShaping.getCodeName().get(), SplitShaping);
		codesByName.put(ThirdParty.getCodeName().get(), ThirdParty);
		codesByName.put(Transformation.getCodeName().get(), Transformation);
	}

	public static GeneratedReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GeneratedReason3Code[] values() {
		GeneratedReason3Code[] values = new GeneratedReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GeneratedReason3Code> {
		@Override
		public GeneratedReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GeneratedReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}