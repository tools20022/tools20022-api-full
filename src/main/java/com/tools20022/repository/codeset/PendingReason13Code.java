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
import com.tools20022.repository.codeset.PendingReason13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction has a pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#AccountServicerDeadlineMissed
 * PendingReason13Code.AccountServicerDeadlineMissed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason13Code#Other
 * PendingReason13Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#PendingBeneficiaryOwnerDetails
 * PendingReason13Code.PendingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#MissingCertification
 * PendingReason13Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#InsufficientMoney
 * PendingReason13Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#LackOfSecurities
 * PendingReason13Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#MarketDeadlineMissed
 * PendingReason13Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#QuantityDisagreement
 * PendingReason13Code.QuantityDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#PendingReceipt
 * PendingReason13Code.PendingReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code#WrongCertificatesNumbers
 * PendingReason13Code.WrongCertificatesNumbers}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
 * PendingFailingReasonCode}</li>
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
 * "PendingReason13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction has a pending status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason14Code
 * PendingReason14Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingReason13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#AccountServicerDeadlineMissed
	 * PendingReason14Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code AccountServicerDeadlineMissed = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.AccountServicerDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#Other
	 * PendingReason14Code.Other}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code Other = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.Other);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingBeneficiaryOwnerDetails"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#PendingBeneficiaryOwnerDetails
	 * PendingReason14Code.PendingBeneficiaryOwnerDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code PendingBeneficiaryOwnerDetails = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingBeneficiaryOwnerDetails";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.PendingBeneficiaryOwnerDetails);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.PendingBeneficiaryOwnerDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#MissingCertification
	 * PendingReason14Code.MissingCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code MissingCertification = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.MissingCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.MissingCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#InsufficientMoney
	 * PendingReason14Code.InsufficientMoney}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code InsufficientMoney = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.InsufficientMoney);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#LackOfSecurities
	 * PendingReason14Code.LackOfSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code LackOfSecurities = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.LackOfSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#MarketDeadlineMissed
	 * PendingReason14Code.MarketDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code MarketDeadlineMissed = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.MarketDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDisagreement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#QuantityDisagreement
	 * PendingReason14Code.QuantityDisagreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code QuantityDisagreement = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDisagreement";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.QuantityDisagreement);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.QuantityDisagreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReceipt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#PendingReceipt
	 * PendingReason14Code.PendingReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code PendingReceipt = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReceipt";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.PendingReceipt);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.PendingReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason13Code
	 * PendingReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PendingReason14Code#WrongCertificatesNumbers
	 * PendingReason14Code.WrongCertificatesNumbers}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PendingReason13Code WrongCertificatesNumbers = new PendingReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.WrongCertificatesNumbers);
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason13Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingReason13Code> codesByName = new LinkedHashMap<>();

	protected PendingReason13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingReason13Code";
				definition = "Specifies the reason why the instruction has a pending status.";
				nextVersions_lazy = () -> Arrays.asList(PendingReason14Code.mmObject());
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingReason13Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingReason13Code.Other,
						com.tools20022.repository.codeset.PendingReason13Code.PendingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.PendingReason13Code.MissingCertification,
						com.tools20022.repository.codeset.PendingReason13Code.InsufficientMoney, com.tools20022.repository.codeset.PendingReason13Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingReason13Code.MarketDeadlineMissed, com.tools20022.repository.codeset.PendingReason13Code.QuantityDisagreement,
						com.tools20022.repository.codeset.PendingReason13Code.PendingReceipt, com.tools20022.repository.codeset.PendingReason13Code.WrongCertificatesNumbers);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PendingBeneficiaryOwnerDetails.getCodeName().get(), PendingBeneficiaryOwnerDetails);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(QuantityDisagreement.getCodeName().get(), QuantityDisagreement);
		codesByName.put(PendingReceipt.getCodeName().get(), PendingReceipt);
		codesByName.put(WrongCertificatesNumbers.getCodeName().get(), WrongCertificatesNumbers);
	}

	public static PendingReason13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingReason13Code[] values() {
		PendingReason13Code[] values = new PendingReason13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingReason13Code> {
		@Override
		public PendingReason13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingReason13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}